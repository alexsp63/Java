package task2;

public class ATM {

    private int N;

    public ATM(int N){
        this.N = N;
    }

    public void add(Card card, int sum){
        System.out.println("Карта №" + card.getNumber() + " пополнена на " + sum + " руб. через терминар №" + N);
    }

    public void add(Wallet wallet, int sum){
        System.out.println("Карта №" + wallet.getNumber() + " пополнена на " + sum + " руб. через терминар №" + N);
        wallet.setBalance(sum);
    }
}
