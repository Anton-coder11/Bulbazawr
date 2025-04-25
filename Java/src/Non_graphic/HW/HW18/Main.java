package Non_graphic.HW.HW18;

public class Main {
    public static void main(String[] args) {
        University university = new University("KPI");
        University.Statistics statistics = university.new Statistics();
        Student anatoly = new Student("Anatoly Kaspersky", 1, 4.5);
        Student vlad = new Student("Vlad Bombrinovski", 2, 2.5);
        Student anastasia = new Student("Anastasia Howdie", 3, 3.0);
        university.addStudent(anatoly);
        university.addStudent(vlad);
        university.addStudent(anastasia);

        university.showStudents();
        statistics.averageGPA();
        statistics.countStudents();
    }
}
