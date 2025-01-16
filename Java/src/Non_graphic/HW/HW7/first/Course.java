package Non_graphic.HW.HW7.first;

public class Course{
    String name;
    String tutor;
    int studentCount;
    public Course(String name,String tutor){
        this.name = name;
        this.tutor = tutor;
        this.studentCount = 0;
    }
    public void incrementStudentCount() {
        studentCount++;
    }
    public void decrementStudentCount() {
        if (studentCount > 0) {
            studentCount--;
        }
        else{
            System.out.println("There is no students in this course");
        }

    }
    public String getName() {
        return name;
    }



    public void displayInfo() {
        System.out.println("Курс: " + name);
        System.out.println("Викладач: " + tutor);
        System.out.println("Кількість студентів: " + studentCount);
    }
}

