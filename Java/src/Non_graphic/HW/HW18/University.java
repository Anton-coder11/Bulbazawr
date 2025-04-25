package Non_graphic.HW.HW18;


import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Student> students;

    public University(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void showStudents(){
        System.out.println("Універсітет: " + name);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    class Statistics {
        public int countStudents(){
            return students.size();
        }
        public void averageGPA(){
            double sum = 0;
            for (Student student : students) {
                sum += student.getGpa();
            }
            System.out.println("Середне GPA: " + sum/students.size());
        }
    }

}
class Student {
    private String name;
    private int year;

    public double getGpa() {
        return gpa;
    }

    private double gpa;

    public Student(String name, int year, double gpa) {
        this.name = name;
        this.year = year;
        this.gpa = gpa;
    }

    @Override
    public String toString() { //Меня ШІ підказав що я простіший спосіб для виведеня
        return "Імʼя: " + name +
                ", Курс: " + year +
                ", GPA: " + gpa + '\n';
    }
}