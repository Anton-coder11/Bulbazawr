package Graphic.L36;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class UI3 extends JFrame implements MouseListener {
    int x;
    int y;
    public UI3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.BLACK);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       x = e.getX();
       y = e.getY();
        Random  random = new Random();
        int radius = random.nextInt(50)+30;
       Ball  ball = new Ball(x-radius/2,y-radius/2,radius,new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)),random.nextInt(20)-10,random.nextInt(20)-10);
        Process potok = new Process( ball, this);
        potok.start();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
class Process extends Thread{
    private Ball ball;
    private  JFrame frame;

    Process(Ball b,JFrame frame){
        this.frame = frame;
        this.ball =  b;

    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            paint();
            ball.move();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void paint(){
        Graphics g = frame.getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(ball.getX()- ball.getDx(),ball.getY()- ball.getDy(),ball.getRadius(),ball.getRadius());
        g.setColor(ball.getColor());
        g.fillOval(ball.getX(),ball.getY(),ball.getRadius(),ball.getRadius());
    }
}
class Ball{
    private int x;
    private int y;
    private int radius;
    private Color color;
    private int dx;
    private int dy;
    Ball(int x, int y, int radius, Color color, int dx, int dy){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;

        this.dx = dx;
        this.dy = dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }
    public void move(){
        x+=dx;
        y+=dy;
//        if (x<=0 || x>=500-radius){
//            dx = -dx;
//        }
//        if (y<=0 || y>=500-radius){
//            dy = -dy;
//        }
    }

}