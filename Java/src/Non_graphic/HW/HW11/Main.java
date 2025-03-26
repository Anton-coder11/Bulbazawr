package Non_graphic.HW.HW11;

public class Main {
    public static void main(String[] args) {
        Company bobrino = new Company();
        bobrino.addEmployee(new Manager("IT", "Bob", 1, 100000));
        bobrino.addEmployee(new Engineer("Electritisan", "John", 2, 100000));
        bobrino.listEmployees();
        bobrino.removeEmployee(1);
    }
}
