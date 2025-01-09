package HW.HW8.first;
//Створіть клас Dish, який представляє страву.
//        Поля: name (назва страви), price (ціна), category (категорія, наприклад: закуска, основна страва, десерт).
//Метод displayInfo() для виведення інформації про страву у форматі: "Назва: [name], Ціна: [price], Категорія: [category]"
public class Dish {
    String name;
    int price;
    String category;
    public Dish(String name, int price, String category){
        this.name = name;
        this.price = price;
        this.category= category;
    }

    public void displayInfo(){
        System.out.println("Назва: " + name);
        System.out.println("Ціна:" + price);
        System.out.println("Категорія:" + category);
        System.out.println("|----------------------------------------|");
    }

    public String getName(){
        return name;
    }
}
