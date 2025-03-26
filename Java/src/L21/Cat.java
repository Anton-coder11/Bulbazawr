package L21;

public class Cat extends Animal {
    private String name = "Cat";
    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }
}
