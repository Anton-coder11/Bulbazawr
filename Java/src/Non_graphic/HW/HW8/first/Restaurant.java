package Non_graphic.HW.HW8.first;

import java.util.ArrayList;

//Створіть клас Restaurant, який управляє стравами.
//Додайте статичний список (ArrayList) для зберігання всіх страв.
//Метод addDish(Dish dish) для додавання нової страви до меню.
//Метод getTotalDishes() (статичний), який повертає кількість страв у меню.
public class Restaurant {
    static ArrayList<Dish> totalDishes = new ArrayList<>();
    public void addDish(Dish dish){
        totalDishes.add(dish);
        if (dish != null) {
            totalDishes.add(dish);
            System.out.println("Страва додана: " + dish.getName());
        } else {
            System.out.println("Неможливо додати страву");
        }
        System.out.println("|----------------------------------------|");
    }
    public static int getTotalDishes(){
        return totalDishes.size();
    }




}
