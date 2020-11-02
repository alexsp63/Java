package task2;

public class Wallet extends EveryTime{

    private int balance;

    public Wallet(String number, int balance) {
        super(number, 42);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int add) {
        this.balance = this.balance+add;
        System.out.println("...Новый баланс карты " + this.getNumber() + " - " + this.balance);
    }

}
