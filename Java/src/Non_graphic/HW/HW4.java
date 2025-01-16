package Non_graphic.HW;//1. Знайти суму елементів масиву
//        Напишіть функцію, яка обчислює суму всіх елементів двовимірного масиву розміром n×m
//
//2. Максимальний елемент у масиві
//Знайдіть максимальний елемент у заданому двовимірному масиві. Виведіть також індекси цього елемента.
//
//3. Сума елементів у кожному рядку
//Для заданого масиву обчисліть суму елементів у кожному рядку. Виведіть ці суми окремо.
//
//        4. Сума елементів головної діагоналі
//Для квадратного масиву знайдіть суму елементів головної діагоналі (де i=j)
//
//        та побічної, і напіщіть де сумма більше
//
//5. Пошук рядка з найбільшою сумою елементів
//Визначте, який рядок у двовимірному масиві має найбільшу суму елементів, і виведіть його індекс.
//
//        6. Діагоналі квадратної матриці
//Для квадратної матриці знайдіть суму елементів головної та побічної діагоналей.
//
//        7. Підрахунок від’ємних елементів
//Знайдіть кількість від’ємних елементів у двовимірному масиві.
//
//8.знайти стовпчик з найбильшою суммою єлементів
//9. Заміна нульових елементів
//У двовимірному масиві замініть усі нульові елементи на середнє арифметичне ненульових елементів масиву.
//
//10. Знайти середнє арифметичне елементів кожного стовпця
//Обчисліть середнє арифметичне для кожного стовпця двовимірного масиву та виведіть ці значення.

public class HW4 {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 1. Знайти суму елементів масиву
        first(array);

        // 2. Максимальний елемент у масиві
        second(array);

        // 3. Сума елементів у кожному рядку
        third(array);

        // 4. Сума елементів головної та побічної діагоналей
        fourth(array);

        // 5. Пошук рядка з найбільшою сумою елементів
        fifth(array);

        // 6. Діагоналі квадратної матриці
        sixth(array);

        // 7. Підрахунок від’ємних елементів
        seventh(array);

        // 8. Знайти стовпчик з найбільшою сумою елементів
        eighth(array);

        // 9. Заміна нульових елементів
        nineth(array);

        // 10. Середнє арифметичне елементів кожного стовпця
        tens(array);
        treugolnicheg1();
        System.out.println();
        treugolnicheg2();
        treugolnicheg3();
        treugolnicheg4();

    }
    // 0. treugolnicheg
    public static void treugolnicheg1(){
        for (int y = 1; y <= 11; y++) {
            for (int x = 1; x <= 11; x++) {
                if (y == x && x<7 || x==1 || 12-x==y && x<7){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
    public static void treugolnicheg2 (){
        for (int y = 1; y <= 11; y++) {
            for (int x = 1; x <= 11; x++) {
                if ( y == 1||y == x && x<6||12-y == x && x>5  ){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
    public static void treugolnicheg3 (){
        for (int y = 1; y <= 11; y++) {
            for (int x = 1; x <= 11; x++) {
                if (y == x && x>5 || x==11 || 12-x==y && x>5){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void treugolnicheg4 (){
        for (int y = 1; y <= 11; y++) {
            for (int x = 1; x <= 11; x++) {
                if ( y == 11||y == x && x>5||12-x==y && x<6 ){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
    // 1. Знайти суму елементів масиву
    public static void first(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        System.out.println("Sum of elements: " + sum);
    }

    // 2. Максимальний елемент у масиві
    public static void second(int[][] array) {
        int max = Integer.MIN_VALUE;
        int[] indices = {-1, -1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        System.out.println("Max element: " + max + " at indices: (" + indices[0] + ", " + indices[1] + ")");
    }

    // 3. Сума елементів у кожному рядку
    public static void third(int[][] array) {
        int[] sums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int element : array[i]) {
                sums[i] += element;
            }
        }
        System.out.println("Row sums: " + java.util.Arrays.toString(sums));
    }

    // 4. Сума елементів головної та побічної діагоналей
    public static void fourth(int[][] array) {
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < array.length; i++) {
            mainDiagonalSum += array[i][i];
            secondaryDiagonalSum += array[i][array.length - 1 - i];
        }
        System.out.println("Main diagonal sum: " + mainDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);
    }

    // 5. Пошук рядка з найбільшою сумою елементів
    public static void fifth(int[][] array) {
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;
        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;
            for (int element : array[i]) {
                currentSum += element;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                rowIndex = i;
            }
        }
        System.out.println("Row with max sum: " + rowIndex);
    }

    // 6. Діагоналі квадратної матриці
    public static void sixth(int[][] array) {
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < array.length; i++) {
            mainDiagonalSum += array[i][i];
            secondaryDiagonalSum += array[i][array.length - 1 - i];
        }
        System.out.println("Main diagonal sum: " + mainDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);
    }

    // 7. Підрахунок від’ємних елементів
    public static void seventh(int[][] array) {
        int count = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative elements count: " + count);
    }

    // 8. Знайти стовпчик з найбільшою сумою елементів
    public static void eighth(int[][] array) {
        int maxSum = Integer.MIN_VALUE;
        int columnIndex = -1;
        for (int j = 0; j < array[0].length; j++) {
            int currentSum = 0;
            for (int i = 0; i < array.length; i++) {
                currentSum += array[i][j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                columnIndex = j;
            }
        }
        System.out.println("Column with max sum: " + columnIndex);
    }

    // 9. Заміна нульових елементів
    public static void nineth(int[][] array) {
        int sum = 0;
        int count = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element != 0) {
                    sum += element;
                    count++;
                }
            }
        }
        double average = count == 0 ? 0 : (double) sum / count;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = (int) Math.round(average);
                }
            }
        }
        System.out.println("Array after replacing zeroes: ");
        for (int[] row : array) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }

    // 10. Середнє арифметичне елементів кожного стовпця
    public static void tens(int[][] array) {
        double[] averages = new double[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            averages[j] = (double) sum / array.length;
        }
        System.out.println("Column averages: " + java.util.Arrays.toString(averages));
    }
}
