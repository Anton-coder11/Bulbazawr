package Graphic.HW.HW17;

import Graphic.HW.HW17.UI;

import javax.swing.*;
import java.awt.*;

public class Timer extends Thread {
    private static UI ui;
    private static int miliseconds = 0 ;
    private static  int seconds = 0;
    private static int minutes = 0;
    private static int hours = 0;
    private static boolean running = true;
    public Timer(UI ui) {
        this.ui = ui;
    }

    public static void stopTimer(){

        running = false;
        System.out.println("Timer stopped" +" : "+ hours + " : "+minutes+ " : "+seconds+ " : "+miliseconds);


    }
    public static void startTimer(){
        ui.centerLabel.setText("Time - " + "00"+ " : " + "00" +" : " + "00" + " : " + "000");
        hours = 0;
        minutes = 0;
        seconds = 0;
        miliseconds = 0;
        running = true;
        Timer timer = new Timer(ui);
        timer.start();
    }
    @Override
    public void run() {
        int i = 0;
        while (running) {
            try {
                Thread.sleep(1);
                miliseconds= i;
                if (miliseconds == 1000) {
                    miliseconds = 0;
                    i = 0;
                    seconds++;
                    if (seconds == 60) {
                        seconds = 0;
                        minutes++;
                        if (minutes == 60) {
                            minutes = 0;
                            hours++;
                        }
                    }
                }
                SwingUtilities.invokeLater(() -> {
                    ui.centerLabel.setText("Time - " + hours + " : " + minutes +" : " + seconds + " : " + miliseconds);
                });
                i++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
