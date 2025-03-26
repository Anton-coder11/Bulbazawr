package Non_graphic.HW.HW11;

import java.util.ArrayList;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void listEmployees(){
        for (Employee employee : employees){
            employee.getDetails();
            System.out.println("--------------------");
        }
    }

    public void removeEmployee(int id){
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).id == id){
                employees.remove(i);
                break;
            }
        }
    }
}
