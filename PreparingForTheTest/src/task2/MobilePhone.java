package task2;

public class MobilePhone {

    private String model;

    public MobilePhone(String model){
        this.model = model;
    }

    public void add(Card card, int sum){
        System.out.println("Карта №" + card.getNumber() + " пополнена на " + sum + " руб. через телефон модели" + model);
    }

    public void add(Wallet wallet, int sum){
        System.out.println("Карта №" + wallet.getNumber() + " пополнена на " + sum + " руб. через телефон модели" + model);
        wallet.setBalance(sum);
    }
}
