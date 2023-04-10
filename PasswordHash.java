import java.security.*;
import java.util.*;

class EncryptPassword {
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hashedBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }

}

class DecryptPassword {
    public static boolean matchPassword(String inputPassword, String hashedPassword) {
        String inputHashedPassword = EncryptPassword.hashPassword(inputPassword);
        return inputHashedPassword.equals(hashedPassword);
    }
}

