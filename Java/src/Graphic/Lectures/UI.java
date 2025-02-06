package Graphic.Lectures;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class UI extends JFrame {
    public UI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new GridBagLayout());

        // Create constraints object
        GridBagConstraints gbc = new GridBagConstraints();

        // Configure first panel
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 0;  // Row 0
        gbc.weightx = 0.5; // Horizontal space distribution
        gbc.weighty = 0.5; // Vertical space distribution
        gbc.fill = GridBagConstraints.BOTH; // Fill space both horizontally and vertically
        gbc.insets = new Insets(5, getWidth()/6, 5, getWidth()/6); // Add padding
        Panelka panel2 =new Panelka();

        add(panel2, gbc);

//        // Configure second panel
//        gbc.gridy = 2;  // Move to next row
//        gbc.weighty = 0.3;
//        JPanel panel = new JPanel();
//        panel.setBorder(new BevelBorder(0));
//        add(panel, gbc);

        MyPanel panel3 = new MyPanel();
        gbc.gridy = 1;  // Move to next row
        gbc.weighty = 0.5;
        add(panel3,gbc);
        setVisible(true);
    }
}

