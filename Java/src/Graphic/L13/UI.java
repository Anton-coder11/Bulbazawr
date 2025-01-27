package Graphic.L13;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame  {
    public UI() {
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Add");
        btn.setBounds(100, 100, 100, 30);
        add(btn);
        JButton btn2 = new JButton("Add");
        btn2.setBounds(200, 100, 100, 30);
        add(btn2);
        JButton btn3 = new JButton("Add3");
        btn3.setBounds(300, 100, 100, 30);
        add(btn3);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("2");
            }
        });



        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("3");
            }
        });








        setVisible(true);
    }
}
