package HW.HW9.first;


import java.util.ArrayList;

public class Library {
    static int bookCount;
    static ArrayList<String> totalBooks = new ArrayList<>();
    public static void addBook(Book book){
        if (book != null) {
            totalBooks.add(book.title);
            System.out.println("Книга додана: " + book.getTitle());
        } else {
            System.out.println("Неможливо додати книгу");
        }
        Library.bookCount ++;
        System.out.println("|----------------------------------------|");

    }
    public static void showBooks() {
        for (int i =0; i < totalBooks.size(); i++) {
            System.out.println(i+1 + " " +totalBooks.get(i));
        }
        System.out.println("|----------------------------------------|");
    }
}

