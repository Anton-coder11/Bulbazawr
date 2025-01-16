package Non_graphic.HW.HW3;
//цикли:
//1 Створіть програму, що виводить на екран перші 55 елементів послідовності 1 3 5 7 9 11 13 15 17
//2 Створіть функцію, яка виводить на екран усі невід'ємні елементи послідовності 90 85 80 75 70 65 60
//3 Створіть функцію, що виводить на екран перші 20 елементів послідовності 2 4 8 16 32 64
//4 Створіть функцію, яка відображає всі числа кратні п'яти, від -29 до 10.
//массиви:
//1 . Створіть функцію, яка приймає массив та знаходить найбільше його значення
//2 . знайдіть суму позитивних чисел у масиві [5,-3,-2,16,55,0]
//3. Заміна всіх від’ємних чисел у масиві на 0
//Напиши функцію, яка замінить всі від’ємні числа в масиві на 0.
//Приклад: Для масиву [1, -3, 4, -2] програма повинна повернути [1, 0, 4, 0].
//4. Пошук індексу елемента в масиві
//Напиши функцію, яка знайде і поверне індекс першого входження числа number у масиві або повідомить, що цього числа немає.
//public static void task4(int [] arr, int number) {}
//Приклад: Для масиву [10, 20, 30, 40] і числа 30 програма повинна повернути 2.
//5. Знайти середнє арифметичне масиву
//Напиши функцію, яка обчислить середнє арифметичне всіх елементів у масиві.
//Приклад: Для масиву [2, 4, 6, 8] програма повинна повернути 5.
//6.Знаходження різниці між найбільшим і найменшим елементами масиву
//Напиши функцію, яка знайде різницю між найбільшим і найменшим елементами масиву.
//Приклад: Для масиву [5, 1, 9, 3] програма повинна повернути 8 (9 - 1).
//7.Підсумовування чисел, що кратні 3
//функція приймає число N. Напиши функцію, яка обчислить суму всіх чисел від 1 до N, які кратні 3.
//не обовьзкова задача з зірочкою:
//8. Виведіть на екран перші 11 членів послідовності Фібоначчі. Нагадуємо, що перший і другий члени послідовності дорівнюють одиницям, а кожен наступний — сумі двох попередніх.
public class Main {

    public static void main(String[] args){
        System.out.println("First");
        first();
        System.out.println("Second");
        second();
        System.out.println("Third");
        third();
        System.out.println("Fourth");
        fourh();
        System.out.println("First of Masives");
        firstOfMasives();
        System.out.println("Second");
        secondOfMasives();
        System.out.println("third");
        thitdOfMasives();
        System.out.println("fourth");
        fourthOfMasives(5);
        fourthOfMasives(20);
        System.out.println("Fifth");
        fifthOfMasives();
        System.out.println("Sixth");
        sixsOfMasives(1,2,3,4);
        sixsOfMasives(4,2,4,214,341);
        System.out.println("Seventh");
        seventhOfMasives(9);
        System.out.println("Eighth");
        fibbanaciSequence();
    }

    public static void  first(){
        int count = 0;
        for (int i = 1; count <55;i +=2){
            count ++;
            System.out.println(i);



        }

    }
    public static void second(){
        //2 Створіть функцію, яка виводить на екран усі невід'ємні елементи послідовності 90 85 80 75 70 65 60
        for (int i = 90; i>=0;i -=5){
            System.out.println(i);
        }
    }
    public static void third(){
        //3 Створіть функцію, що виводить на екран перші 20 елементів послідовності 2 4 8 16 32 64
        int count = 0;
        for (int i =2; count <20; i *=2){
            count++;
            System.out.println(i);
        }
    }
    public static void fourh(){
        //4 Створіть функцію, яка відображає всі числа кратні п'яти, від -29 до 10.
        for (int i = -29; i <=10; i++){
            if (i%5 == 0){
                System.out.println(i);
            }
        }
    }
    public static void firstOfMasives(){
        //1 . Створіть функцію, яка приймає массив та знаходить найбільше його значення
        String [] list = {"1","2","3","4","5","6","7","8","9","10"};

        int max = Integer.parseInt(list[0]);
        for (int i = 1; i < list.length; i++){
            if (Integer.parseInt(list[i]) > max){
                max = Integer.parseInt(list[i]);
            }
        }
        System.out.println("The biggest number is " + max);
        System.out.println("Оно само предложило такой вариант а я и не против)");
    }
    public static void secondOfMasives(){
        //2 . знайдіть суму позитивних чисел у масиві [5,-3,-2,16,55,0]]

        int [] list = {5,-3,-2,16,55,0};
        int sum = 0;
        for (int i = 0; i < list.length; i++){
            if (list[i] > 0){
                sum += list[i];
            }
        }
        System.out.println(sum);


    }
    public static void thitdOfMasives (){
        //3. Заміна всіх від’ємних чисел у масиві на 0
        //Напиши функцію, яка замінить всі від’ємні числа в масиві на 0.
        //Приклад: Для масиву [1, -3, 4, -2] програма повинна повернути [1, 0, 4, 0].int [] list = {1,-3,4,-2};
        int [] list = {1,-3,4,-2};
        for (int i = 0; i < list.length; i++){
            if (list[i] < 0){
                list[i] = 0;
            }
        }
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }

    }
    public static void fourthOfMasives(int number){
        //4. Пошук індексу елемента в масиві
//Напиши функцію, яка знайде і поверне індекс першого входження числа number у масиві або повідомить, що цього числа немає.
//public static void task4(int [] arr, int number) {}
//Приклад: Для масиву [10, 20, 30, 40] і числа 30 програма повинна повернути 2.
        int [] list = {10,20,30,40};
        int index = 0;
        for (int i = 0; i < list.length; i++){
            if (list[i] == number){
                index = i;
                System.out.println(index);
                break;

            }
            else{
                System.out.println("Number not found");
            }
        }
    }
    public static void fifthOfMasives  (){
        //5. Знайти середнє арифметичне масиву
//Напиши функцію, яка обчислить середнє арифметичне всіх елементів у масиві.
//Приклад: Для масиву [2, 4, 6, 8] програма повинна повернути 5.
        int []list = {2,4,6,8};
        int sum = 0;
        for (int i = 0; i < list.length; i++){
            sum += list[i];
        }
        System.out.println(sum/list.length);
    }
    public static void sixsOfMasives(int ... numbers){

//6.Знаходження різниці між найбільшим і найменшим елементами масиву
//Напиши функцію, яка знайде різницю між найбільшим і найменшим елементами масиву.
//Приклад: Для масиву [5, 1, 9, 3] програма повинна повернути 8 (9 - 1).
        if (numbers == null || numbers.length == 0) {
            System.out.println("Массив пуст или не задан.");
            return;
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        int difference = max - min;
        System.out.println("Разница между максимальным и минимальным элементами массива: " + difference + " (" + max + " - " + min + ")");
    }
    public static void seventhOfMasives(int N){
        //7.Підсумовування чисел, що кратні 3
        //функція приймає число N. Напиши функцію, яка обчислить суму всіх чисел від 1 до N, які кратні 3.
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех чисел, кратных 3, от 1 до " + N + " равна " + sum);

    }
    public static void fibbanaciSequence (){
        //8. Виведіть на екран перші 11 членів послідовності Фібоначчі. Нагадуємо, що перший і другий члени послідовності дорівнюють одиницям, а кожен наступний — сумі двох попередніх.

        int n = 11;
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Первые " + n + " членов последовательности Фибоначчи:");
        for (int number : fibonacci) {
            System.out.print(number + " ");
        }
        }
}


