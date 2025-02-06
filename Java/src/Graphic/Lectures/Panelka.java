package Graphic.Lectures;

import javax.swing.*;
import java.awt.*;

public class Panelka extends JPanel {

    public Panelka(){
        setBackground(Color.BLACK);
        setSize(200,200);

    }


//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//
//        g.setColor(Color.BLUE);
//        g.drawLine(30,50,500,500);
//    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.GREEN);

        // Малюємо горизонтальну лінію для повзунка
        int y = 100;
        g.drawLine(50, y, 450, y);

        // Малюємо 10 вертикальних ліній для відрізків
        for (int i = 0; i <= 10; i++) {
            int x = 50 + i * 40;
            g.drawLine(x, y - 10, x, y + 10);
            if (x == 250){
                int width = 20;
                int hight = 20;
                g.setColor(Color.cyan);
                g.fillRect(x - width/2, y-50,width,hight);
                g.setColor(Color.green);
            }
        }
    }
}
