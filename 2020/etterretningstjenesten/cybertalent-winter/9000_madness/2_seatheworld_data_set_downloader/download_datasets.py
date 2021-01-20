import os
import sys
import paramiko

DEBUG = True

USERNAME = "ibmuser"
PASSWORD = "sys1"

TEMPORARY_DATASET_PATH = "/tmp/dataset"
DATASETS_LOCAL_PATH = "./files/datasets"
FILE_ENCODING = "ibm037" # Also known as cp037 and ibm039


DATASETS = [ 
    "IBMUSER.SEATW.BOOKINGS",
    "IBMUSER.SEATW.SRC(C)",
    "IBMUSER.SEATW.SRC(JCL)",
    "IBMUSER.SEATW.SRC(CIPHER)",
]

class Client:
    def __init__(self, host, port, username, password):
        self.host = host
        self.port = port
        self.username = username
        self.password = password
        self.t = None
        self.sftp = None
        self.ssh = None

    def connect_sftp(self):
        print("Connecting to SFTP")
        self.t = paramiko.Transport((self.host, self.port))
        self.t.connect(username=self.username, password=self.password)
        self.sftp = paramiko.SFTPClient.from_transport(self.t)
        print("Connected to SFTP")

    def connect_ssh(self):
        print("Connecting to SSH")
        self.ssh = paramiko.SSHClient()
        self.ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
        self.ssh.connect(
            self.host,
            port=self.port,
            username=self.username,
            password=self.password
        )
        print("Connected to SSH")

    def connect(self):
        self.connect_sftp()
        self.connect_ssh()

    def close(self):
        if self.t:
            self.t.close()
        if self.sftp:
            self.sftp.close()
        if self.ssh:
            self.ssh.close()

    def sh(self, command):
        if DEBUG:
            print("Executing SSH command: {}".format(command))
        stdin, stdout, stderr = self.ssh.exec_command(command)
        out = stdout.read().decode()
        if DEBUG:
            print(out)
        return out

    def download_file(self, remote_path, local_path):
        # Download the remote file to local host
        try:
            self.sftp.get(remote_path, local_path)
        except Exception as e:
            print("[ERROR] Could not download {}: {}".format(remote_path, str(e)))
            os.remove(local_path)
            return

        # We now need to convert the encoding of the file (ibm037) to utf-8
        with open(local_path, "r", encoding=FILE_ENCODING) as f:
            contents = f.read().encode()

        # It seems like we have the encoding, as it is unable to convert some characters correctly
        # Let's fix that manually
        contents = contents.replace(b"\xc2\x85", b"\n")
        contents = contents.replace(b"\xc3\x9d", b"[")
        contents = contents.replace(b"\xc2\xa8", b"]")

        # Save contents of the file with the correct encoding
        with open(local_path, "w") as f:
            f.write(contents.decode())

    def download_datasets(self, datasets):
        print("Downloading {} datasets".format(len(datasets)))
        for dataset in datasets:
            self.download_dataset(dataset)
        print("Downloaded {} datasets".format(len(datasets)))

    def download_dataset(self, dataset):
        print("Downloading dataset: {}".format(dataset))
        # Extract the dataset from z/OS and save it to a temporary path on UNIX
        self.sh("cp \"//'{}'\" {}".format(
            dataset,
            TEMPORARY_DATASET_PATH
        ))

        # Download the dataset
        self.download_file(
            remote_path=TEMPORARY_DATASET_PATH,
            local_path="{}/{}".format(
                DATASETS_LOCAL_PATH,
                dataset
            )
        )

        # Delete the temporary dataset
        self.sh("rm {}".format(
            TEMPORARY_DATASET_PATH
        ))

        print("Downloaded dataset...")

if len(sys.argv) != 3:
    print("Usage: python3 download_datasets.py <host> <ssh_port>")
    print("Example: python3 download_datasets.py nusse.seatheworld.tld 22")
    exit(1)

host = sys.argv[1]
port = int(sys.argv[2])

# Create output path if it does not exist
if not os.path.exists(DATASETS_LOCAL_PATH):
    os.makedirs(DATASETS_LOCAL_PATH)

client = Client(host, port, USERNAME, PASSWORD)
client.connect()

try:
    client.download_datasets(DATASETS)
finally:
    client.close()
