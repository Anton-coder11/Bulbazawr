package Graphic.HW1;

import javax.swing.*;

public class UI extends JFrame {
    public UI(){
        setSize(120,240);
        setLayout(null);

        JButton btn1 = new JButton("1");
        btn1.setBounds(0,40,40,40);
        JButton btn2 = new JButton("2");
        btn2.setBounds(40,40,40,40);
        JButton btn3 = new JButton("3");
        btn3.setBounds(80,40,40,40);
        JButton btn4 = new JButton("4");
        btn4.setBounds(0,80,40,40);
        JButton btn5 = new JButton("5");
        btn5.setBounds(40,80,40,40);
        JButton btn6 = new JButton("6");
        btn6.setBounds(80,80,40,40);
        JButton btn7 = new JButton("7");
        btn7.setBounds(0,120,40,40);
        JButton btn8 = new JButton("8");
        btn8.setBounds(40,120,40,40);
        JButton btn9 = new JButton("9");
        btn9.setBounds(80,120,40,40);
        JButton btn0 = new JButton("0");
        btn0.setBounds(40,160,40,40);
        JTextField text = new JTextField("ф");
        text.setBounds(0,0,120,40);
        add(text);



        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn0);
        setVisible(true);
    }
}
