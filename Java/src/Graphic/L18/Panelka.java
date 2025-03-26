package Graphic.L18;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panelka extends JPanel  implements KeyListener {
    private BufferedImage image;
    private int x = -40;
    private int y = -25;
    Panelka(UI ui){
        ui.addKeyListener(this);
        try {
            image = ImageIO.read(new File("/Users/anton/Desktop/coding/HILEL/JAVA/Java/src/Graphic/L18/image.png")); // Замініть на свій шлях

        } catch (IOException e) {
            e.printStackTrace();
        }

        potok.start();
        potok2.start();
        potok3.start();

    }


    public int getCoordX() {
        return x;
    }

    public void setCoordX(int x) {
        this.x = x;
    }


    public int getCoordY() {
        return y;
    }

    public void setCoordY(int y) {
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, x, y, this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    Process potok = new Process(this);
    Process2 potok2 = new Process2(this);
    Process3 potok3 = new Process3(this);
    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyChar()){
            case '1':
                potok.run=true;
                potok2.run=false;
                potok3.run=false;

                break;
            case '2':
                potok2.run=true;
                potok3.run=false;
                potok.run=false;
                break;
            case '3':
                potok3.run=true;
                potok2.run=false;
                potok.run=false;
                break;
            case 's':
                potok3.run=false;
                potok2.run=false;
                potok.run=false;
                break;
        }
        repaint();
        System.out.println(e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
