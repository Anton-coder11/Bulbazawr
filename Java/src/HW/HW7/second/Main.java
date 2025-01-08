package HW.HW7.second;

public class Main {
    public static void main(String[] args) {
        // Створення клієнта
        Client client1 = new Client("Петро", 456);
        client1.createBalance(789, 1000.0);
        System.out.println("|--------------------------------------|");
        // Виведення інформації про клієнта та баланс
        client1.getInfo();
        client1.getBalance().getInfo();
        System.out.println("|--------------------------------------|");
        // Зняття грошей
        client1.getBalance().withdraw(500);
        client1.getBalance().getInfo();
        System.out.println("|--------------------------------------|");
        // Поповнення балансу
        client1.getBalance().deposit(200);
        client1.getBalance().getInfo();
    }
}
