package Hashing;

import javax.swing.*;

public class NewsFeed {
    public NewsFeed(int id) {
        Reader reader = new Reader();

        JFrame newsFeedFrame = new JFrame("Beta | News Feed");
        JLabel welcomeMessage = new JLabel();

        newsFeedFrame.setSize(1000,600);
        newsFeedFrame.setLocationRelativeTo(null);
        welcomeMessage.setBounds(300,100,200,30);
        welcomeMessage.setText("Welcome " + reader.arrayOfNames.get(id));

        newsFeedFrame.add(welcomeMessage);

        newsFeedFrame.setLayout(null);
        newsFeedFrame.setVisible(true);
        newsFeedFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
