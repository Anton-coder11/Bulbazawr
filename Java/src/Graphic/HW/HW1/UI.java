package Graphic.HW.HW1;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
    public UI(){

                JFrame frame = new JFrame("bruh");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 400);

                JTextField display = new JTextField();
                display.setEditable(false);
                frame.add(display, BorderLayout.NORTH);
                JPanel buttonPanel = new JPanel();
                buttonPanel.setLayout(new GridLayout(4, 4));


                String[] buttons = {
                        "1", "2", "3", "=",
                        "4", "5", "6", "*",
                        "7", "8", "9", "/",
                        ".", "0", "-", "+"
                };

                for (String text : buttons) {
                    JButton button = new JButton(text);
                    buttonPanel.add(button);
                }

                frame.add(buttonPanel, BorderLayout.CENTER);


                frame.setVisible(true);





            }
        }