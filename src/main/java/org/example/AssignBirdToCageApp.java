package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AssignBirdToCageApp {
    private JFrame frame;

    public AssignBirdToCageApp() {
        frame = new JFrame("Assign Bird to Cage");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10)); // Adjust rows, columns, and spacing as needed

        JLabel birdIdLabel = new JLabel("Bird ID:");
        JTextField birdIdField = new JTextField(10);

        JLabel cageIdLabel = new JLabel("Cage ID:");
        JTextField cageIdField = new JTextField(10);

        JButton assignButton = new JButton("Assign");
        assignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get bird ID and cage ID from the fields and perform assignment logic
                String birdId = birdIdField.getText();
                String cageId = cageIdField.getText();
                // Perform actions for assigning bird to cage
                JOptionPane.showMessageDialog(frame, "Bird " + birdId + " assigned to Cage " + cageId);
            }
        });

        panel.add(birdIdLabel);
        panel.add(birdIdField);
        panel.add(cageIdLabel);
        panel.add(cageIdField);
        panel.add(new JLabel());
        panel.add(assignButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 150); // Set the frame size as needed
        frame.setVisible(true);
    }
}
