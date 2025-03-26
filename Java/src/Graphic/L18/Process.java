package Graphic.L18;

public class Process extends Thread{
    Boolean run = false;
    private Panelka panelka;

    public Process(Panelka panelka) {
        this.panelka = panelka;

    }

    public void run(){


            while (true){
                if (!run) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continue;
                }
                panelka.setCoordY(-25);
                panelka.setCoordX(panelka.getCoordX()-  140);
                if (panelka.getCoordX()<-140*6)
                    panelka.setCoordX(-40);

                panelka.repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }



    }
}
