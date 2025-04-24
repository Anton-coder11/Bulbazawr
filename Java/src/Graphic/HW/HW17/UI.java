package Graphic.HW.HW17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UI extends JFrame {
    public JLabel centerLabel;
    public JButton startButton;
    public JButton stopButton;
    private Timer timer;

    public UI() {
        setTitle("Centered Label");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        centerLabel = new JLabel("Time - " + "00"+ " : " + "00" +" : " + "00" + " : " + "000");
        centerLabel.setHorizontalAlignment(JLabel.CENTER);

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        setLayout(new BorderLayout());
        add(centerLabel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
        add(stopButton, BorderLayout.NORTH);

        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (timer == null || !timer.isAlive()) {
                    timer = new Timer(UI.this);
                    Timer.startTimer();
                }
            }
        });
        stopButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Timer.stopTimer();
            }
        });
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI();
    }

}
