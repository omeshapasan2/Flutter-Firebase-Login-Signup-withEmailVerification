package com.project.Fably_Fashion_App.services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHasher {

    public static String hash(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = digest.digest(password.getBytes());

            StringBuilder passwordHash = new StringBuilder();

            for (byte b : hashBytes) {
                passwordHash.append(String.format("%02x", b));
            }

            return passwordHash.toString();
        }catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error initializing SHA-256 algorithm", e);
        }
    }

    public static boolean checkPassword(String password, String passwordHash){
        String hashedPassword = hash(password);
        System.out.println("Entered Password hash: "+hashedPassword);
        System.out.println("Stored Password hash: "+passwordHash);
        return hashedPassword.equals(passwordHash);
    }
}
