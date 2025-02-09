package Graphic.HW14;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.*;

public class Paint extends JFrame implements MouseMotionListener {
    Graphics g = getGraphics();
    Color color = Color.RED;
    boolean clear = false;
    int x;
    int y;
    public Paint() {

        super("Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.blue);// я не знаю як так

        addMouseMotionListener(this);
        JButton button1 = new JButton("Black");
        button1.setBounds(0, 0, 100, 30);
        button1.addActionListener((e)->color =Color.black);
        add(button1);
        JButton button2 = new JButton("Green");

        button2.setBounds(150, 1, 100, 30);
        button2.addActionListener((e)->color =Color.GREEN);
        add(button2);
        JButton button3 = new JButton("Red");
        button3.setBounds(300, 1, 100, 30);
        button3.addActionListener((e)->color =Color.RED);
        add(button3);
        JButton button4 = new JButton("Clear");
        button4.setBounds(450, 1, 100, 30);
        button4.addActionListener((e) -> repaint());
        add(button4);


        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        g = getGraphics();
        g.setColor(color);
        if (x==0&&y==0){
            x = e.getX();
            y = e.getY();
            return;
        }
        g.drawLine(x,y,e.getX(),e.getY());
        x = e.getX();
        y = e.getY();
    }

    public void mouseMoved(MouseEvent e) {
        x = 0;
        y = 0;
    }
}
