package HW.HW7.second;

public class Balance {
    int balanceId;
    double balance;
//Конструктор для класу Рахунок, який приймає номер рахунку та початковий баланс.
    public Balance(int balanceId,double initialBalance){
        this.balanceId = balanceId;
        this.balance = initialBalance;

    }
//Метод покластиГроші() в класі Рахунок, який додає вказану суму на баланс рахунку.

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Додано: " + amount + ". Новий баланс: " + balance);
    }
    //Метод знятиГроші() в класі Рахунок, який знімає вказану суму з балансу рахунку. Перевірити, чи достатньо коштів на рахунку.
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Недостатньо коштів для зняття: " + amount);
        } else {
            balance -= amount;
            System.out.println("Знято: " + amount + ". Новий баланс: " + balance);
        }
    }
    public int getBalanceId() {
        return balanceId;
    }


    //Метод вивестиІнформацію() в обох класах, який виводить інформацію про об'єкт у консоль.
    public void getInfo(){
        System.out.println("Номер балансу: " + balanceId);
        System.out.println("Баланс: " + balance);
    }
}

