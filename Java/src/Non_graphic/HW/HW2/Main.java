package Non_graphic.HW.HW2;
//Умови на if-else:
//Перевірка парності числа:
//Якщо число парне, вивести "парне", інакше — "непарне".
//        2 Визначення, чи є число додатним, від’ємним або нулем.
//3 Перевірка часу доби:
//Якщо година між 6 і 12 — "Ранок", між 12 і 18 — "День", між 18 і 22 — "Вечір", інакше — "Ніч".
//        4Перевірка доступу до ресурсу:
//Якщо користувач має пароль і логін правильні, дозволити доступ, інакше — відмовити.
//
//5 Перевірка, чи може трикутник існувати:
//
//Якщо сума двох будь-яких сторін трикутника більша за третю, трикутник існує.
//
//6 Порівняння трьох чисел:
//
//Визначити, яке з трьох чисел найбільше.
//
//7 Перевірка, чи входить число в діапазон:
//
//Якщо число знаходиться між 1 і 100 включно, вивести "У діапазоні", інакше — "Не в діапазоні".
//
//        8 Оцінка успішності студента:
//
//Якщо оцінка >= 90, вивести "Відмінно", >= 75 — "Добре", >= 50 — "Задовільно", інакше — "Не задовільно".
//
//        2. Умови на switch:
//Визначення дня тижня за номером:
//Якщо 1 — "Понеділок", 2 — "Вівторок", ..., 7 — "Неділя".
//
//        2 Вибір операції за введеним символом:
//
//Якщо + — додавання, - — віднімання, * — множення, / — ділення.
//
//3 Визначення пори року за місяцем:
//
//Якщо 12, 1, 2 — "Зима", 3, 4, 5 — "Весна", 6, 7, 8 — "Літо", 9, 10, 11 — "Осінь".
public class Main {

    public static void main(String[] args){

        System.out.println("First task");
        firstTask(3);
        firstTask(200);
        System.out.println("Second Task");
        secondTask(2);
        secondTask(-1);
        secondTask(0);
        System.out.println("Third Task");
        thirdTask(7);
        thirdTask(13);
        thirdTask(21);
        thirdTask(24);
        thirdTask(25);
        System.out.println("Fourth Task");
        fourthTask("AntonOparin2008","12345678");
        fourthTask("hubbabubba","why");
        System.out.println("Fifth Task");
        fifthTask(1,2,3);
        fifthTask(3,4,5);
        System.out.println("Task number six");
        sixthTask(1,3,2);
        sixthTask(5,3,2);
        sixthTask(1,3,25);
        sixthTask(1,1,1);
        System.out.println("Task number seven");
        seventhTask(5);
        seventhTask(1);
        seventhTask(0);
        seventhTask(101);
        System.out.println("Task number eigth");
        eigthTask(101);
        eigthTask(76);
        eigthTask(50);
        eigthTask(25);
        eigthTask(0);
        eigthTask(-5);
        System.out.println("Task number Nine");
        ninethTask(5);
        ninethTask(7);
        ninethTask(9);
        System.out.println("Task number TEN");
        tenthTask("+",1,2);
        tenthTask("/",1,5);
        tenthTask("-",1,6);
        tenthTask("*",10,2);
        System.out.println("Task number ELEVEN");
        eleventhTask(1);
        eleventhTask(4);
        eleventhTask(6);
        eleventhTask(10);
    }

    public static  void firstTask(int a){
        //Якщо число парне, вивести "парне", інакше — "непарне".
        int input = a;
        boolean isInputEven = (input % 2) == 0;
        if (isInputEven == true){
            System.out.println("Номер парний");
        }
        else{
            System.out.println("Номер непарний");
        }



    }

    public static  void secondTask(int input) {

        //2 Визначення, чи є число додатним, від’ємним або нулем.
        if (input > 0) {
            System.out.println("The number is bigger than 0");
        } else if (input < 0) {
            System.out.println("The number is smaller than 0");
        }
        else{
            System.out.println("The number is 0");
        }
    }

    public static void thirdTask(int time){
        //3 Перевірка часу доби:
        //Якщо година між 6 і 12 — "Ранок", між 12 і 18 — "День", між 18 і 22 — "Вечір", інакше — "Ніч".
        if (time>=6 && time<=12){
            System.out.println("It is morning");
        }
        else if (time>12 && time<=18){
            System.out.println("It is day");
        }
        else if (time>18 && time<=22){
            System.out.println("It is evening");
        }
        else if (time > 24){
            System.out.println("The input time is incorrect, are you sure you are able to write time correctly?");
        }
        else {
            System.out.println("It is night");
        }
    }

    public static void fourthTask(String users_login, String users_password){
        //4Перевірка доступу до ресурсу:
        //Якщо користувач має пароль і логін правильні, дозволити доступ, інакше — відмовити.
        String login = "AntonOparin2008";
        String password = "12345678";

        if (users_password == password || users_login == password){
            System.out.println("Password and login are correct ,welcome!");
        }
        else{
            System.out.println("Password or login is incorrect");
        }


    }

    public static void fifthTask(int a,int b,int c){
        //5 Перевірка, чи може трикутник існувати:
        //Якщо сума двох будь-яких сторін трикутника більша за третю, трикутник існує.
        if ((a + b) > c && (a+c) > b && (b+c) > a) {
            System.out.println("The triangle exists");
        }
        else{
            System.out.println("The doesnt triangle exists");
        }
    }

    public static void sixthTask(int a,int b,int c){
        //6 Порівняння трьох чисел:
        //Визначити, яке з трьох чисел найбільше.
        if (c == a && b == a && c == b){
            System.out.println("All number are same");
        }
        else if (a >= b && a >=c){
            System.out.println(a + " Is the biggest");
        }

            // Comparing 2nd no with 1st and 3rd no
        else if (b >= a && b >= c){
            System.out.println(b + " Is the biggest");
        }

        else if (c >= a && c >= b){
            System.out.println(c + " Is the biggest");
        }

       else if (c == a && b == a && c == b){
            System.out.println("All number are same");
        }
    }

    public static void seventhTask(int a){
        //7 Перевірка, чи входить число в діапазон:
        //Якщо число знаходиться між 1 і 100 включно, вивести "У діапазоні", інакше — "Не в діапазоні".
        if(a >= 1 && a<=100 ){
            System.out.println("The number is inside interval ");
        }
        else{
            System.out.println("The number is not inside interval");
        }
    }

    public static void eigthTask(int grade){
        //8 Оцінка успішності студента:
        //Якщо оцінка >= 90, вивести "Відмінно", >= 75 — "Добре", >= 50 — "Задовільно", інакше — "Не задовільно".
        if (grade >=90){
            System.out.println("Very well");
        }
        else if (grade >=75 && grade <90){
            System.out.println("Good");
        }
        else if (grade >=50 && grade <75){
            System.out.println("Ok");
        }
        else if (grade >=0 && grade <50 ){
            System.out.println("Failed");
        }
        else {
            System.out.println("Like how in the world you got negative grade?");
        }
    }

    public static void ninethTask(int day){
        //Визначення дня тижня за номером:
        //Якщо 1 — "Понеділок", 2 — "Вівторок", ..., 7 — "Неділя".
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("There is  only 7 day in the weekend dummie");
        }

    }

    public static void tenthTask(String input,int a,int b) {
        //2 Вибір операції за введеним символом:
        //Якщо + — додавання, - — віднімання, * — множення, / — ділення.
        switch (input) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
        }
    }

    public static void eleventhTask(int month){
        //3 Визначення пори року за місяцем:
        //Якщо 12, 1, 2 — "Зима", 3, 4, 5 — "Весна", 6, 7, 8 — "Літо", 9, 10, 11 — "Осінь".
        switch (month){
            case 12,1,2:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Autumn");
                break;
        }
    }
}


