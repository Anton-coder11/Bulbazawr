package Non_graphic.HW.HW19;

public class Main {

    public static void main(String[] args) {
        Dog barsik = new Dog(true);
        Cat murzik = new Cat(false);

        barsik.voice();
        barsik.eat();
        barsik.displayInfo();
        murzik.voice();
        murzik.eat();
        murzik.displayInfo();
    }
}
