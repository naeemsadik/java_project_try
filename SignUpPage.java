import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class SignUpPage {
    public SignUpPage() {
        JFrame SignUpPage = new JFrame();
        JLabel name =  new JLabel("Name: ");
        JTextField nameBox = new JTextField();
        JLabel password = new JLabel("Password: ");
        JPasswordField passwordBox = new JPasswordField();
        JLabel email =  new JLabel("Email: ");
        JTextField emailBox = new JTextField();
        JButton SignUpButton = new JButton("Sign Up");
        SignUpButton.setBackground(new Color(66, 198, 246, 163));

        SignUpPage.setSize(400,400);
        SignUpPage.setLocationRelativeTo(null);

        name.setBounds(50,50,80,30);
        nameBox.setBounds(130,50,200,30);
        password.setBounds(50,130,80,30);
        passwordBox.setBounds(130,130,200,30);
        email.setBounds(50,200,80,30);
        emailBox.setBounds(130,200,200,30);
        SignUpButton.setBounds(165,280,100,30);

        SignUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = nameBox.getText()+"-"+EncryptPassword.hashPassword(String.valueOf(passwordBox.getPassword()))+"-"+emailBox.getText();
                new Writer(s,true);

                SignUpPage.setVisible(false);
                LogInPage logInPage = new LogInPage();
                logInPage.SetVisible(true);
            }
        });

        SignUpPage.setLayout(null);
        SignUpPage.add(emailBox);
        SignUpPage.add(passwordBox);
        SignUpPage.add(nameBox);
        SignUpPage.add(email);
        SignUpPage.add(password);
        SignUpPage.add(name);
        SignUpPage.add(SignUpButton);
        SignUpPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SignUpPage.setVisible(true);
    }

}
