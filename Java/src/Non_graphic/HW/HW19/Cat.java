package Non_graphic.HW.HW19;

public class Cat extends  Pet implements Animal {
    public Cat(boolean sleeps){
        super.isSleepingOnThecouch = sleeps;
    }
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }


    public void displayInfo(){

        System.out.println("Cat is a pet");
        System.out.println("Cat is a animal");
        System.out.println(super.isSleepingOnThecouch());
    }
}
