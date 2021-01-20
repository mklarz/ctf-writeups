# 2_seatheworld_data_set_downloader

There is a way to download the data sets in the mainframe through the UNIX shell. This script connects to the host through SSH and transfers the data sets from the main frame, to the host, and finally to localhost. More information regarding copying files can be found [here](https://www.ibm.com/support/knowledgecenter/SSLTBW_2.4.0/com.ibm.zos.v2r4.bpxa400/cpfilemem.htm).

The downloaded data sets can be found found [here](./datasets).
```python
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
```

---

During the creation of this script, we find out about [
Unix File Systems in z/OS](https://mtm2017.mybluemix.net/part_two/part_two_ch11.html) and attempt to enumerate them to see if there are any hdiden filesystems (without luck).

```
IBMUSER:/u/ibmuser: >df -P
Filesystem          512-blocks        Used  Available  Capacity Mounted on
DFH320.ZFS               57600       39308      18292       69% /Z110/usr/lpp/cicsts/cicsts32
ACD211.SACDZFS1          14400        7458       6942       52% /Z110/usr/lpp/jcct4v3
DSN910.SJVAZFS           14400         358      14042        3% /u/db9g
DSN910.SDSNWORF          72000        3232      68768        5% /Z110/usr/lpp/db2910_worf
DSN910.SDSNMQLS          72000        3974      68026        6% /Z110/usr/lpp/db2910_mql
DSN910.SDSNJCC           72000       10706      61294       15% /Z110/usr/lpp/db2910_jdbc
DSN910.SDSNAZFS          72000       17420      54580       25% /Z110/usr/lpp/db2910_base
ZFS.ADCD.VARWBEM        144000       33618     110382       24% /ADCD/var/wbem
ZFS.ADCD.VAR              2880         832       2048       29% /ADCD/var
ZFS.ADCD.DEV              8640         324       8316        4% /ADCD/dev
ZFS.Z110.VERSION.ZFS   4320000     4291616      28384      100% /Z110
JVA500.HFS              557664      528784      28712       95% /Z110/usr/lpp/java
CSQ700.MQM.HFS          114528      114176        120      100% /Z110/usr/lpp/mqm/V7R0M0
IEL370.HFS                2496        2288         72       97% /Z110/usr/lpp/pli
IGY410.HFS                 960         488        216       70% /Z110/usr/lpp/cobol
NET530.HFS               17472        9832       7392       58% /Z110/usr/lpp/netview
DFH320.SECURITY.HFS       1440         144       1160       12% /Z110/usr/lpp/cicsts/cicsts32/lib/security
DFH320.SAMPLES.HFS       14400       11296       2880       80% /Z110/usr/lpp/cicsts/cicsts32/samples
DFH320.JVMPROFS.HFS       1440          80       1224        7% /Z110/usr/lpp/cicsts/cicsts32/JVMProfiles
DFH320.PROPS.HFS          1440         112       1192        9% /Z110/usr/lpp/cicsts/cicsts32/props
HFS.WEB                  18720        4048      14424       22% /web
HFS.USERS                11712         584      10872        6% /u
HFS.USR.MAIL              1440          40       1264        4% /Z110/usr/mail
HFS.ADCD.TMP              4416          88       4192        3% /ADCD/tmp
HFS.ADCD.ETC              4800        3304       1256       73% /ADCD/etc
HFS.ADCD.HFS              1440         104       1200        8% /ADCD
HFS.ADCDPL.ROOT           1440         176       1016       15% /
```
