package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CageRegistrationApp {
    private JFrame frame;

    public CageRegistrationApp() {
        frame = new JFrame("Cage Registration");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10)); // Adjust rows, columns, and spacing as needed

        JLabel cageIdLabel = new JLabel("Cage ID:");
        JTextField cageIdField = new JTextField(10);

        JButton registerCageButton = new JButton("Register Cage");
        registerCageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get cage ID from the field and perform registration logic
                String cageId = cageIdField.getText();
                // Perform actions for registering a cage
                JOptionPane.showMessageDialog(frame, "Cage " + cageId + " registered successfully!");
            }
        });

        panel.add(cageIdLabel);
        panel.add(cageIdField);
        panel.add(new JLabel());
        panel.add(registerCageButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 150); // Set the frame size as needed
        frame.setVisible(true);
    }
}