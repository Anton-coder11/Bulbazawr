package Non_graphic.HW.HW11;

public class Manager extends Employee{
    String department;
    public Manager(String department,String name, int id, double salary) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public void getDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

}
