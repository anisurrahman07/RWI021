package javabasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerManagement {

    private static String authToken;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Customer Management App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 1));

        JButton loginButton = new JButton("Login");
        JButton customerListButton = new JButton("Get Customer List");

        panel.add(loginButton);
        panel.add(customerListButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                authenticateUser();
            }
        });

        customerListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCustomerList();
            }
        });

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private static void authenticateUser() {
    }

    private static void getCustomerList() {
    }
}