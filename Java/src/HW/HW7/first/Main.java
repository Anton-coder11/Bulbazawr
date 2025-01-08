package HW.HW7.first;
//public class Main {
//    public static void main(String[] args) {
//        Студент студент1 = new Студент("Іван", 123);
//        Курс курс1 = new Курс("Програмування на Java", "Петренко");
//
//        студент1.записатисьНаКурс(курс1);
//
//        студент1.вивестиІнформацію();
//        курс1.вивестиІнформацію();
//
//        студент1.відписатисьВідКурсу();
//
//        студент1.вивестиІнформацію();
//        курс1.вивестиІнформацію();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Daniliano",420);
        Course course1 = new Course("Cooking with Tim","Tim Butchers");
        System.out.println("Enrolling new Student");
        System.out.println("|--------------------------------------|");
        student1.enrollInCourse(course1);
        System.out.println("Displaying Info About Student");
        System.out.println("|--------------------------------------|");
        student1.displayInfo();
        System.out.println("Displaying Info About Student");
        System.out.println("|--------------------------------------|");
        course1.displayInfo();
        System.out.println("Unenrolling new Student");
        System.out.println("|--------------------------------------|");
        student1.unenrollFromCourse();
        System.out.println("Displaying Info About Student");
        System.out.println("|--------------------------------------|");
        student1.displayInfo();
        System.out.println("Displaying Info About Student");
        System.out.println("|--------------------------------------|");
        course1.displayInfo();
    }
}
