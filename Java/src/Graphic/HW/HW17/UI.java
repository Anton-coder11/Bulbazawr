package Graphic.HW.HW17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UI extends JFrame {
    public JLabel centerLabel;
    public JButton startButton;
    public JButton stopButton;
    private JPanel topPanel=new JPanel();
    private JPanel bottomPanel=new JPanel();
    private Timer timer;

    public UI() {

        setTitle("Centered Label");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        centerLabel = new JLabel("Time - " + "00"+ " : " + "00" +" : " + "00" + " : " + "000");
        centerLabel.setHorizontalAlignment(JLabel.CENTER);
        centerLabel.setVerticalAlignment(JLabel.CENTER);
        centerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        topPanel.add(centerLabel,BorderLayout.NORTH);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0.6;
        gbc.fill = GridBagConstraints.BOTH;
            add(topPanel, gbc);
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 1;
            gbc.weighty = 0.4;
            add(bottomPanel, gbc);

        bottomPanel.setLayout(new GridLayout(3,1));
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");


        bottomPanel.add(startButton);
        bottomPanel.add(stopButton);

        startButton.addActionListener(e -> {
            if (timer == null || !timer.isAlive()) {
                timer = new Timer(UI.this);
                Timer.startTimer();
            }
        });

        stopButton.addActionListener(e -> Timer.stopTimer());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI();
    }

}
