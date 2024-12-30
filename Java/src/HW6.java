public class HW6 {
        public static void main(String[] args) {
            int[] array = {5, 2, 9, 1, 5, 6,87,98,9,6,56,764};

            System.out.println("Before sorting:");
            printArray(array);

            insertionSort(array);

            System.out.println("After sorting:");
            printArray(array);
            System.out.println("First task");
            System.out.println(firstTask(3));
            System.out.println(firstTask(200));
            System.out.println("Second Task");
            System.out.println(secondTask(2));
            System.out.println(secondTask(-1));
            System.out.println(secondTask(0));
            System.out.println("Third Task");
            System.out.println(thirdTask(7));
            System.out.println(thirdTask(13));
            System.out.println(thirdTask(21));
            System.out.println(thirdTask(24));
            System.out.println(thirdTask(25));
            System.out.println("Fourth Task");
            System.out.println(fourthTask("AntonOparin2008", "12345678"));
            System.out.println(fourthTask("hubbabubba", "why"));
            System.out.println("Fifth Task");
            System.out.println(fifthTask(1, 2, 3));
            System.out.println(fifthTask(3, 4, 5));
            System.out.println("Task number six");
            System.out.println(sixthTask(1, 3, 2));
            System.out.println(sixthTask(5, 3, 2));
            System.out.println(sixthTask(1, 3, 25));
            System.out.println(sixthTask(1, 1, 1));
            System.out.println("Task number seven");
            System.out.println(seventhTask(5));
            System.out.println(seventhTask(1));
            System.out.println(seventhTask(0));
            System.out.println(seventhTask(101));
            System.out.println("Task number eigth");
            System.out.println(eigthTask(101));
            System.out.println(eigthTask(76));
            System.out.println(eigthTask(50));
            System.out.println(eigthTask(25));
            System.out.println(eigthTask(0));
            System.out.println(eigthTask(-5));
            System.out.println("Task number Nine");
            System.out.println(ninethTask(5));
            System.out.println(ninethTask(7));
            System.out.println(ninethTask(9));
            System.out.println("Task number TEN");
            System.out.println(tenthTask("+", 1, 2));
            System.out.println(tenthTask("/", 1, 5));
            System.out.println(tenthTask("-", 1, 6));
            System.out.println(tenthTask("*", 10, 2));
            System.out.println("Task number ELEVEN");
            System.out.println(eleventhTask(1));
            System.out.println(eleventhTask(4));
            System.out.println(eleventhTask(6));
            System.out.println(eleventhTask(10));
        }

        public static void insertionSort(int[] array) {
            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;
                for (; j >= 0 && array[j] > key; j--) {
                    array[j + 1] = array[j];
                }
                array[j + 1] = key;
            }
        }
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    public static String firstTask(int a) {
        return (a % 2 == 0) ? "Номер парний" : "Номер непарний";
    }

    public static String secondTask(int input) {
        if (input > 0) {
            return "The number is bigger than 0";
        } else if (input < 0) {
            return "The number is smaller than 0";
        } else {
            return "The number is 0";
        }
    }

    public static String thirdTask(int time) {
        if (time >= 6 && time <= 12) {
            return "It is morning";
        } else if (time > 12 && time <= 18) {
            return "It is day";
        } else if (time > 18 && time <= 22) {
            return "It is evening";
        } else if (time > 24) {
            return "The input time is incorrect, are you sure you are able to write time correctly?";
        } else {
            return "It is night";
        }
    }

    public static String fourthTask(String users_login, String users_password) {
        String login = "AntonOparin2008";
        String password = "12345678";

        if (users_password.equals(password) && users_login.equals(login)) {
            return "Password and login are correct, welcome!";
        } else {
            return "Password or login is incorrect";
        }
    }

    public static String fifthTask(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return "The triangle exists";
        } else {
            return "The triangle doesn't exist";
        }
    }

    public static String sixthTask(int a, int b, int c) {
        if (a == b && b == c) {
            return "All numbers are the same";
        } else if (a >= b && a >= c) {
            return a + " is the biggest";
        } else if (b >= a && b >= c) {
            return b + " is the biggest";
        } else {
            return c + " is the biggest";
        }
    }

    public static String seventhTask(int a) {
        return (a >= 1 && a <= 100) ? "The number is inside the interval" : "The number is not inside the interval";
    }

    public static String eigthTask(int grade) {
        if (grade >= 90) {
            return "Very well";
        } else if (grade >= 75) {
            return "Good";
        } else if (grade >= 50) {
            return "Ok";
        } else if (grade >= 0) {
            return "Failed";
        } else {
            return "How in the world did you get a negative grade?";
        }
    }

    public static String ninethTask(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "There are only 7 days in a week, dummie";
        };
    }

    public static String tenthTask(String input, double a, double b) {
        return switch (input) {
            case "+" -> String.valueOf(a + b);
            case "-" -> String.valueOf(a - b);
            case "*" -> String.valueOf(a * b);
            case "/" -> (b != 0) ? String.valueOf(a / b) : "Division by zero error";
            default -> "Invalid operation";
        };
    }

    public static String eleventhTask(int month) {
        return switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month";
        };
    }
}


