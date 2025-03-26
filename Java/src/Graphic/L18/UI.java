package Graphic.L18;



import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
    public UI(){
        super("UI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLayout(null);
        JPanel panelka = new Panelka(this);
        panelka.setBounds(getWidth()/2-65,getHeight()/2-65,130,130);
        add(panelka);

        panelka.setBackground(Color.cyan);



        setVisible(true);
    }
}
