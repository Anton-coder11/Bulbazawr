package L21;

public class Dog extends Animal{
    private String name = "Dog";
    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }
}
