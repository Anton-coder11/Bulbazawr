package Non_graphic.HW.HW19;

public class Dog extends Pet implements Animal{
    public Dog(boolean sleeps){
        super.isSleepingOnThecouch = sleeps;
    }
    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void displayInfo(){

        System.out.println("Dog is a pet");
        System.out.println("Dog is a animal");
        System.out.println(super.isSleepingOnThecouch());
    }
}
