package Graphic.Lectures;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class MyPanel extends JPanel implements MouseMotionListener {
    int x = getWidth()/2-20;
    MyPanel(){
        addMouseMotionListener(this);
    }
    int percente = 0;

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
        }

        g.drawLine(50, y, 450, y);
        g.drawLine(450,y,450,y+30);
        g.setColor(Color.RED);
        g.fillRect(x-getWidth()/10/2, y - 30, getWidth()/15, getWidth()/10);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getX() > 50 && e.getX() < 450)
            x = e.getX();
        else if (e.getX() > 450)
            x = 450;
        else if (e.getX() < 50)
            x = 50;
        repaint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
    public int getPercente(){
        return percente;
    }
}
