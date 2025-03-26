package Graphic.L18;

public class Process4 extends Thread{
    Boolean run = true;
    private Panelka panelka;

    public Process4(Panelka panelka) {
        this.panelka = panelka;

    }

    public void run(){
        while (run){
            panelka.setCoordX(panelka.getCoordX()-  140);
            if (panelka.getCoordX()<-140*6)
                panelka.setCoordX(-40);

            panelka.repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
