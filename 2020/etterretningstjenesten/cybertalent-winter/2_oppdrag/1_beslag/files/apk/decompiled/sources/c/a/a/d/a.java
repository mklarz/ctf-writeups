package c.a.a.d;

import android.util.Log;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1089a = "saltpaamaten".getBytes();

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f1090b = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f1090b;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static void b(File file, File file2, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] readAllBytes = Files.readAllBytes(file.toPath());
            byte[] copyOfRange = Arrays.copyOfRange(readAllBytes, 0, 16);
            byte[] copyOfRange2 = Arrays.copyOfRange(readAllBytes, 16, readAllBytes.length);
            SecretKey c2 = c(bArr);
            if (c2 == null) {
                Log.e(a.class.getSimpleName(), "Failed to generate key");
            }
            instance.init(2, c2, new IvParameterSpec(copyOfRange));
            byte[] doFinal = instance.doFinal(copyOfRange2);
            Files.write(file2.toPath(), doFinal, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r6.printStackTrace();
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    public static SecretKey c(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("md5");
            instance.update(bArr);
            byte[] bArr2 = instance.digest();
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(bArr2 != null ? new PBEKeySpec(a(bArr2).toCharArray(), f1089a, 65536, 256) : null).getEncoded(), "AES");
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
            return null;
        }
    }
}
