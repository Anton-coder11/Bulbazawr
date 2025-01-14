package HW.HW9.first;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Pepsi Cola in the world of sugat", "Arnold Shwarcnegger",432);
        Book book2 = new Book("Coca Cola in the marketing hell", "Barak Obama",195);
        Library.addBook(book1);
        Library.addBook(book2);
        Library.showBooks();
        System.out.println(Library.bookCount);

    }
}
