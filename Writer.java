package Hashing;

import java.io.*;

public class Writer {
    public Writer(String S, boolean append) {
        String fileName = "information.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append))) {
            writer.append(S + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
