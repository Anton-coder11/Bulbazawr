package Non_graphic.HW.HW11;

public class Engineer extends Employee {
        String speaciality;
        public Engineer(String speaciality, String name, int id, double salary){
            super(name, id, salary);
            this.speaciality = speaciality;
       }

        @Override
        public void getDetails () {
        System.out.println("Engineer Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("speaciality: " + speaciality);
    }


}
