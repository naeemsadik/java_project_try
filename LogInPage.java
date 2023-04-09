package Hashing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LogInPage {
    public LogInPage() {
        JFrame logInFrame = new JFrame();
        JLabel email =  new JLabel("Email: ");
        JTextField emailBox = new JTextField();
        JLabel password = new JLabel("Password: ");
        JPasswordField passwordBox = new JPasswordField();
        JButton logInButton = new JButton("Log In");
        logInButton.setBackground(new Color(66, 198, 246, 163));

        logInFrame.setSize(400,300);
        logInFrame.setLocationRelativeTo(null);

        email.setBounds(50,50,80,30);
        emailBox.setBounds(130,50,200,30);
        password.setBounds(50,130,80,30);
        passwordBox.setBounds(130,130,200,30);
        logInButton.setBounds(175,200,80,30);

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indexOfPassword = Reader.arrayOfEmails.indexOf(emailBox.getText());
                passwordBox.getPassword();
                String Password = Reader.arrayOfPassword.get(indexOfPassword);
                System.out.println(Password);
                System.out.println(indexOfPassword);
                Boolean matched = DecryptPassword.matchPassword(Arrays.toString(passwordBox.getPassword()), Password);
                if(matched == true) {
                    System.out.println("Password Matched. You're logged in");

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

    public void setVisible(boolean b) {
//        if(b == true) this.setVisible(true);
//        else if(b == false) this.setVisible(false);
    }
}
