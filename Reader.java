package Hashing;

import java.io.*;
import java.util.*;

public class Reader {

    static ArrayList<String> arrayOfNames = new ArrayList<>();
    static ArrayList<String> arrayOfPassword = new ArrayList<>();
    static ArrayList<String> arrayOfEmails = new ArrayList<>();
    {
        String fileName = "information.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] infoArray = line.split("-");
                arrayOfNames.add(infoArray[0]);
                arrayOfPassword.add(infoArray[1]);
                arrayOfEmails.add(infoArray[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}