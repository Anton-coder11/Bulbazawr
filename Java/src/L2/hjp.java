package L2;

public class hjp {


    
            public static void main(String[] args) {

                int [] array = {1,2,13,4,5,6,7,8,9,10};
                int [][] array2 = {{1,2,3},{4,5,6},{7,18,9}};

                printArray(array2);

            }


            public static void printArray(int [][] array){
                int sum = 0; // Переменная для хранения суммы
                for (int i = 0; i < array.length; i++) { // Проход по строкам массива
                    for (int j = 0; j < array[i].length; j++) { // Проход по элементам строки
                        sum += array[i][j]; // Сложение элементов
                    }
                }
                System.out.println("Сумма всех чисел массива: " + sum);
            }





}
