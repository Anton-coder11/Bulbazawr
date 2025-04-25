package Non_graphic.HW.HW19;

public abstract class Pet {
    protected boolean isSleepingOnThecouch;
    protected Pet(){
        this.isSleepingOnThecouch = false;
    }
    public String isSleepingOnThecouch() {
        if (isSleepingOnThecouch == true){
            return "Is sleeping on the couch";
        }
        else {
            return "Is not sleeping on the couch";
        }
    }

    public void setSleepingOnThecouch(boolean sleepingOnThecouch) {
        isSleepingOnThecouch = sleepingOnThecouch;
    }
}
