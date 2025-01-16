package Non_graphic.HW.HW9.first;

public class Book {
    String title;
    String author;
    int bookPages;

    public Book(String title, String author,int bookPages){
        this.title = title;
        this.author = author;
        this.bookPages =bookPages;
    }

    public  String getTitle(){
        return title;
    }
}
