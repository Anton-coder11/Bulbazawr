package Non_graphic.HW.HW8.second;
//У методі main:
//Створіть кілька об’єктів класу Car (наприклад, Tesla Model S, Ford Mustang).
//Виведіть інформацію про кожен автомобіль.
//Виведіть загальну кількість автомобілів, використовуючи поле totalCarsProduced.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Skyline R34",1998,"Nissan");
        Car car2 = new Car("Koenigsegg One:1",2014,"Koenigsegg" );

        car1.displayInfo();
        car2.displayInfo();
        System.out.println(Car.totalCarProduced);
    }





}

