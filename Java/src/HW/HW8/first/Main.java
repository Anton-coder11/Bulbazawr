package HW.HW8.first;
//У методі main:
//Створіть кілька об’єктів класу Dish (наприклад, суп, піца, морозиво).
//Додайте ці страви до ресторану.
//Виведіть інформацію про всі страви та загальну кількість страв у меню.
public class Main {
    public static void main(String[] args) {
        Dish pizza = new Dish("Піца", 10, "Гаряче");
        Dish icecream = new Dish("Морозиво",3,"Холодне");
        Dish soup =new Dish("Суп",5,"Гаряче");
        Restaurant restaurant = new Restaurant();
        restaurant.addDish(pizza);
        restaurant.addDish(icecream);
        restaurant.addDish(soup);
        pizza.displayInfo();
        icecream.displayInfo();
        soup.displayInfo();
        System.out.println(Restaurant.getTotalDishes());


    }
}
