package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BirdRegistrationApp {
    private JFrame frame;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;

    public BirdRegistrationApp() {
        frame = new JFrame("Bird Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Género
        JLabel genderLabel = new JLabel("Género: ");
        panel.add(genderLabel, gbc);

        maleRadioButton = new JRadioButton("Macho");
        femaleRadioButton = new JRadioButton("Fêmea");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);

        gbc.gridx++;
        panel.add(genderPanel, gbc);

        // Anilha número
        gbc.gridx = 0;
        gbc.gridy++;
        JLabel dumbbellLabel = new JLabel("Anilha número: ");
        panel.add(dumbbellLabel, gbc);

        JTextField dumbbellIDField = new JTextField(20);
        gbc.gridx++;
        panel.add(dumbbellIDField, gbc);

        // Gaiola número
        gbc.gridx = 0;
        gbc.gridy++;
        JLabel cageLabel = new JLabel("Gaiola número: ");
        panel.add(cageLabel, gbc);

        JTextField cageIDField = new JTextField(20);
        gbc.gridx++;
        panel.add(cageIDField, gbc);

        // Anilha Mãe
        gbc.gridx = 0;
        gbc.gridy++;
        JLabel motherLabel = new JLabel("Anilha Mãe: ");
        panel.add(motherLabel, gbc);

        JTextField motherIDField = new JTextField(20);
        gbc.gridx++;
        panel.add(motherIDField, gbc);

        // Anilha Pai
        gbc.gridx = 0;
        gbc.gridy++;
        JLabel fatherLabel = new JLabel("Anilha Pai: ");
        panel.add(fatherLabel, gbc);

        JTextField fatherIDField = new JTextField(20);
        gbc.gridx++;
        panel.add(fatherIDField, gbc);

        // Raça
        gbc.gridx = 0;
        gbc.gridy++;
        JLabel birdLabel = new JLabel("Raça: ");
        panel.add(birdLabel, gbc);

        JTextField birdTypeField = new JTextField(20);
        gbc.gridx++;
        panel.add(birdTypeField, gbc);

        // Registar Pássaro Button
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JButton registerButton = new JButton("Registar Pássaro");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Registration logic (unchanged)
                String selectedGender = maleRadioButton.isSelected() ? "Macho" : "Fêmea";
                System.out.println("Anilha número: " + dumbbellIDField.getText());
                System.out.println("Gaiola número: " + cageIDField.getText());
                System.out.println("Anilha Mãe: " + motherIDField.getText());
                System.out.println("Anilha Pai: " + fatherIDField.getText());
                System.out.println("Raça: " + birdTypeField.getText());
                System.out.println("Género: " + selectedGender);
            }
        });
        panel.add(registerButton, gbc);

        frame.getContentPane().add(panel);
        frame.pack(); // Adjusts frame size based on components
        frame.setLocationRelativeTo(null); // Centers the frame on the screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BirdRegistrationApp());
    }
}