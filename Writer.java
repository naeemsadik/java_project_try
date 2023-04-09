package Hashing;

import java.io.*;

public class Writer {
    public Writer(String S) {
        String fileName = "information.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.append(S);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
