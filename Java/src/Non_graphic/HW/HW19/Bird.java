package Non_graphic.HW.HW19;

public class Bird implements Animal{
    @Override
    public void voice() {
        System.out.println("Chirik");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }
}
