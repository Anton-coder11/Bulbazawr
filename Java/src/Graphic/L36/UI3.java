package Graphic.L36;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UI3 extends JFrame implements MouseListener {
    int widthOfFrame =500;
    int heightOfFrame =500;
    int x;
    int y;
    static ArrayList<Ball> balls = new ArrayList<>();
    public UI3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(widthOfFrame,heightOfFrame);
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

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        Random  random = new Random();
        int radius = random.nextInt(50)+30;
        Ball  ball = new Ball(x-radius/2,y-radius/2,radius,new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)),random.nextInt(40)-10,random.nextInt(40)-10);
        balls.add(ball);
        Process potok = new Process( ball, this);
        potok.start();
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
    private List<Ball> balls = UI3.balls;
    Process(Ball b,JFrame frame){
        this.frame = frame;
        this.ball =  b;


    }
    @Override
    public void run() {
        for (int i = 0; i <=500; i++) {



            checkCollisions();



            ball.move();
            paint();
            try {
                sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }




    }

    public void checkCollisions(){
        for (int i = 0; i < balls.size(); i++) {
            for (int j = i+1; j < balls.size(); j++) {
                Ball ball1 = balls.get(i);
                Ball ball2 = balls.get(j);
                double dx = ball1.getX() - ball2.getX();
                double dy = ball1.getY() - ball2.getY();
                double distance =  Math.sqrt(dx*dx + dy*dy);
                if (distance <=  ball1.getRadius() /2 +  ball2.getRadius() /2){
                    int tempDx = ball1.getDx();

                    int tempDy = ball1.getDy();
                    ball1.setDx(ball2.getDx());
                    ball1.setDy(ball2.getDy());

                    ball2.setDx(tempDx);
                    ball2.setDy(tempDy);
                }
            }
        }
    }

    public void paint(){
        Graphics g = frame.getGraphics();
        if(ball.isMoving()) {
            g.setColor(Color.black);
            g.fillOval( (ball.getX()- ball.getDx()),  (ball.getY()- ball.getDy()),  ball.getRadius(),  ball.getRadius());
        }

        g.setColor(ball.getColor());
        g.fillOval( ball.getX(),  ball.getY(),  ball.getRadius(),  ball.getRadius());



    }
}

class Ball{
    private int x;
    private int y;
    private int radius;
    private Color color;
    private int dx;
    private int dy;

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    private boolean isMoving = false;
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDy() {
        return dy;
    }
    public void move(){

        if (x<=0 || x>=500-radius){
            dx = -dx;
        }
        if (y<=28 || y>=500-radius){
            dy = -dy;

        }
        x+=dx;
        y+=dy;
        isMoving = true;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }
}