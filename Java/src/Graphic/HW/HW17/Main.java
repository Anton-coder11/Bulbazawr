//Написати Таймер або секундомер використовуючи потоки.
//зробити функції зі стоками
//.Підрахунок слів
//
//        Написати функцію, яка підраховує кількість слів у рядку.
//
//. Задача про підрахунок кількості голосних літер: Напишіть метод, який приймає рядок і повертає кількість голосних літер (a, e, i, o, u) у цьому рядку.
//
//        . Задача про перевірку на паліндром: Напишіть метод, який перевіряє, чи є заданий рядок паліндромом. Паліндром - це слово, яке читається однаково зліва направо і справа наліво.
//
//по бажанню:
//
//        ,Анаграмма
//
//        Написати функцію, яка перевіряє, чи є два рядки анаграмами (містять однакові символи у різному порядку).
//
//public boolean areAnagrams(String str1, String str2) {
//
//    // Ваша реалізація
//
//}
//
//string function
package Graphic.HW.HW17;


public class Main {
    public static void main(String[] args) {
        new UI();
        String str = "Aboba is An aboba  na si  Abobba";
        System.out.println(countWords(str));
        System.out.println(getVocals(str));
        System.out.println(palindromOrNot(str));
    }
    public static int countWords(String str){
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public static int getVocals(String str){
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(Character.toLowerCase(str.charAt(i))) != -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean palindromOrNot(String str){
        String reversedString ="";
        for (int i = 1; i <= str.length(); i++) {
            reversedString += str.charAt(str.length()-i);
        }

        return reversedString.equals(str);
    }
}
