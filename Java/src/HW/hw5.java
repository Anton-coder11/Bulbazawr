package HW;//Переставити місцями рядки з найбільшою та найменшою сумою елементів
//Дано двовимірний масив розміру N×MN \times M
//
//N×M. Знайдіть рядки з найбільшою та найменшою сумою елементів і поміняйте їх місцями.
//
//Заміна рядків на суму їхніх елементів
//Дано двовимірний масив розміру N×MN \times M
//
//N×M. Замініть кожен елемент рядка на суму елементів цього рядка.
//
//Заміна рядків на стовпці в окремих місцях
//Дано квадратну матрицю N×NN \times N
//
//N×N. Замініть місцями рядок з номером ii
//
//i і стовпець з номером jj
//
//j (номери задає користувач).
//
//Обнулення елементів над і під головною діагоналлю
//Дано квадратну матрицю N×NN \times N
//
//N×N. Замініть усі елементи, що знаходяться вище головної діагоналі, на 0. Окремо виконайте це ж завдання для елементів нижче діагоналі.


public class hw5 {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(1);
        // Переставити місцями рядки з найбільшою та найменшою сумою елементів
        swapRowsWithMaxAndMinSum(array);
        printArray(array);
        System.out.println(2);
        // Заміна рядків на суму їхніх елементів
        replaceRowsWithSum(array);
        printArray(array);
        System.out.println(3);
        // Заміна рядків на стовпці в окремих місцях
        replaceRowWithColumn(array, 1, 2);
        printArray(array);

        // Обнулення елементів над і під головною діагоналлю
        setAboveDiagonalToZero(array);
        printArray(array);

        setBelowDiagonalToZero(array);
        printArray(array);
    }

    // Переставити місцями рядки з найбільшою та найменшою сумою елементів
    public static void swapRowsWithMaxAndMinSum(int[][] array) {
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        int maxRowIndex = -1, minRowIndex = -1;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int element : array[i]) {
                sum += element;
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRowIndex = i;
            }
            if (sum < minSum) {
                minSum = sum;
                minRowIndex = i;
            }
        }

        // Swap the rows
        int[] temp = array[maxRowIndex];
        array[maxRowIndex] = array[minRowIndex];
        array[minRowIndex] = temp;
    }

    // Заміна рядків на суму їхніх елементів
    public static void replaceRowsWithSum(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int element : array[i]) {
                rowSum += element;
            }
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rowSum;
            }
        }
    }

    // Заміна рядків на стовпці в окремих місцях
    public static void replaceRowWithColumn(int[][] array, int row, int col) {
        if (row < 0 || row >= array.length || col < 0 || col >= array[0].length) {
            System.out.println("Invalid row or column idex");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            int temp = array[row][i];
            array[row][i] = array[i][col];
            array[i][col] = temp;
        }
    }

    // Обнулення елементів над головною діагоналлю
    public static void setAboveDiagonalToZero(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }
    }

    // Обнулення елементів під головною діагоналлю
    public static void setBelowDiagonalToZero(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                array[i][j] = 0;
            }
        }
    }

    // Utility method to print the array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

