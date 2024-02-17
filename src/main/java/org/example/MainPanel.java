package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

public class MainPanel {
    private JFrame frame;

    public MainPanel() {
        frame = new JFrame("Main Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10)); // Adjust rows, columns, and spacing as needed

        JButton birdRegistrationButton = new JButton("Bird Registration");
        birdRegistrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BirdRegistrationApp();
            }
        });

        JButton cageRegistrationButton = new JButton("Cage Registration");
        cageRegistrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CageRegistrationApp();
            }
        });

        JButton assignBirdToCageButton = new JButton("Assign Bird to Cage");
        assignBirdToCageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AssignBirdToCageApp();
            }
        });

        JButton birdListButton = new JButton("Bird List");
        birdListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Here you would populate 'birds' with the actual list of registered birds from your application
                ArrayList<Bird> birds = new ArrayList<>();
                new BirdListApp(birds);
            }
        });

        panel.add(birdRegistrationButton);
        panel.add(cageRegistrationButton);
        panel.add(assignBirdToCageButton);
        panel.add(birdListButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(1920, 1080); // Set the frame size as needed
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainPanel());
    }
}