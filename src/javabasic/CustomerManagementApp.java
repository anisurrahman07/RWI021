package javabasic;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerManagementApp {

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
        // TODO: Implement authentication logic using the provided API
        // You can use the credentials and API endpoint mentioned in the description
        // Update the 'authToken' variable with the received bearer token
    }

    private static void getCustomerList() {
        // TODO: Implement logic to fetch and display customer list using the provided API
        // Use the 'authToken' variable in the Authorization header
    }
}
