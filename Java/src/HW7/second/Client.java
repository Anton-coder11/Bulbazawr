package HW7.second;

public class Client {
    String name;
    int clientId;
    Balance balance;
//Конструктор для класу Клієнт, який приймає ім'я та номер клієнта.
    public Client(String name,int clientId){
        this.name = name;
        this.clientId = clientId;
        this.balance = null;
    }
    //Метод створитиРахунок() в класі Клієнт, який створює новий рахунок для клієнта та встановлює зв'язок між клієнтом та рахунком.
    public void createBalance(int accountNumber, double initialBalance) {
        if (this.balance != null) {
            System.out.println("У клієнта вже є баланс!");
            return;
        }
        this.balance = new Balance(accountNumber, initialBalance);
        System.out.println("Баланс створено для клієнта: " + name);
    }
    public Balance getBalance() {
        return this.balance;
    }

    //Метод вивестиІнформацію() в обох класах, який виводить інформацію про об'єкт у консоль.
    public void getInfo(){
        System.out.println("Клієнт: " + name);
        System.out.println("ID клієнта: " + clientId);
        if (balance != null) {
            System.out.println("Номер рахунку: " + balance.getBalanceId());
        } else {
            System.out.println("Рахунок не створено.");
        }
    }
}
