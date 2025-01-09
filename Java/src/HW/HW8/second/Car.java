package HW.HW8.second;
//Створіть клас Car, який представляє автомобіль.
//        Поля: model (модель автомобіля), year (рік випуску), manufacturer (виробник).
//Додайте статичне поле totalCarsProduced, яке відображає загальну кількість випущених автомобілів.
//У конструкторі збільшуйте значення totalCarsProduced щоразу, коли створюється новий об'єкт.
//Метод displayInfo() для виведення інформації про автомобіль у форматі: "Модель: [model], Рік: [year], Виробник: [manufacturer]".

public class Car {

    String model;
    int year;
    String manufacturer;
    static int totalCarProduced;

    public Car(String model,int year,String manufacturer){
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        totalCarProduced++;
    }

    public void displayInfo(){
        System.out.println("Модель: "+ model);
        System.out.println("Рік: " + year);
        System.out.println("Виробник: " + manufacturer);
        System.out.println("|----------------------------------|");
    }

}

