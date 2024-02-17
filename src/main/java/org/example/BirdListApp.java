package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BirdListApp {
    private JFrame frame;
    private DefaultListModel<String> birdListModel;

    public BirdListApp(ArrayList<Bird> birdList) {
        frame = new JFrame("Bird List");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("List of Registered Birds");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        birdListModel = new DefaultListModel<>();
        JList<String> birdJList = new JList<>(birdListModel);
        JScrollPane scrollPane = new JScrollPane(birdJList);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Populate the list with bird information
        updateBirdList(birdList);

        frame.getContentPane().add(panel);
        frame.setSize(300, 200); // Set the frame size as needed
        frame.setVisible(true);
    }

    // Method to update the bird list
    public void updateBirdList(ArrayList<Bird> birdList) {
        birdListModel.clear();
        for (Bird bird : birdList) {
            birdListModel.addElement("Bird ID: " + bird.getDumbbell() + " | Type: " + bird.getType());
            // Add more details as needed
        }
    }

    // Example usage
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Bird(Bird.GENDER.FEMALE, 1));
        birds.add(new Bird(Bird.GENDER.MALE, 2));

        SwingUtilities.invokeLater(() -> new BirdListApp(birds));
    }
}