package Hashing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInPage {
    public LogInPage() {
        JFrame logInFrame = new JFrame();
        JLabel email = new JLabel("Email: ");
        JTextField emailBox = new JTextField();
        JLabel password = new JLabel("Password: ");
        JPasswordField passwordBox = new JPasswordField();
        JButton logInButton = new JButton("Log In");
        logInButton.setBackground(new Color(66, 198, 246, 163));

        logInFrame.setSize(400, 300);
        logInFrame.setLocationRelativeTo(null);

        email.setBounds(50, 50, 80, 30);
        emailBox.setBounds(130, 50, 200, 30);
        password.setBounds(50, 130, 80, 30);
        passwordBox.setBounds(130, 130, 200, 30);
        logInButton.setBounds(175, 200, 80, 30);

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Reader reader = new Reader();
                    int indexOfEmail = reader.arrayOfEmails.indexOf(emailBox.getText());
                    if (indexOfEmail == -1) {
                        System.out.println("Email not found");
                        return;
                    }
                    String password = Reader.arrayOfPassword.get(indexOfEmail);
                    boolean matched = DecryptPassword.matchPassword(new String(passwordBox.getPassword()), password);
                    if (matched) {
                        System.out.println("Password matched. You're logged in");
                    } else {
                        System.out.println("Password does not match");
                    }
                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });

        logInFrame.setLayout(null);
        logInFrame.add(emailBox);
        logInFrame.add(passwordBox);
        logInFrame.add(email);
        logInFrame.add(password);
        logInFrame.add(logInButton);
        logInFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        logInFrame.setVisible(true);
    }

    public void SetVisible(boolean b) {
        //I don't know what to do?
    }
}
