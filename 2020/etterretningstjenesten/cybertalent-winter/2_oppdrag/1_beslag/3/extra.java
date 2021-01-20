package com.example.extra;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class extra {
    private static final String SALT = "y_so_salty";

    public static byte[] getData(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(SALT);
        byte[] bArr = new byte[0];
        byte[] bArr2 = new byte[0];
        try {
            MessageDigest instance = MessageDigest.getInstance("md5");
            instance.update(sb.toString().getBytes());
            bArr = instance.digest();
            MessageDigest instance2 = MessageDigest.getInstance("sha256");
            instance2.update(sb.toString().getBytes());
            bArr2 = instance2.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(bArr2);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }
}
