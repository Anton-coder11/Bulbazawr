package HW.HW7.first;

public class Student {
    String name;
    int id;
    Course course;
    public Student(String name,int id){
        this.id = id;
        this.name = name;
        this.course = null;
    }

    public void enrollInCourse(Course newCourse) {
        if (this.course != null) {
            System.out.println("Студент вже записаний на курс: " + course.getName());
            return;
        }
        this.course = newCourse;
        newCourse.incrementStudentCount();
        System.out.println(name + " записаний на курс: " + newCourse.getName());
    }
    public void unenrollFromCourse() {
        if (this.course == null) {
            System.out.println(name + " не записаний на жоден курс.");
            return;
        }
        System.out.println(name + " відписаний від курсу: " + this.course.getName());
        this.course.decrementStudentCount();
        this.course = null;
    }
    public void displayInfo() {
        System.out.println("Студент: " + name);
        System.out.println("ID: " + id);
        if (course != null) {
            System.out.println("Курс: " + course.getName());
        } else {
            System.out.println("Курс: не записаний.");
        }
    }
}
