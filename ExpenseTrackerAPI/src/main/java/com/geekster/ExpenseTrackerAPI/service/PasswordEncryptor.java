package com.geekster.ExpenseTrackerAPI.service;

import jakarta.xml.bind.DatatypeConverter;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptor {

    public static String encrypt(String password) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(password.getBytes());
        byte[] digested = md5.digest();
        return DatatypeConverter.printHexBinary(digested);
    }
}
