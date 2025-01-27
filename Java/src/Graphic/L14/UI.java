package Graphic.L14;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {

    public UI() {


        setSize(800, 600);
        setLayout(new GridLayout(2,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        for (int i = 0; i < 4; i++) {
            JButton btn3 = new JButton(String.valueOf(i));
            btn3.addActionListener(this);
            add(btn3);
        }
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
//            case "1":+
//                System.out.println("1");
//                break;
//            case "2":-
//                System.out.println("2");
//                break;
            default:
                System.out.println(e.getActionCommand());
                break;
        }

    }
}


