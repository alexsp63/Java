package task2;

public abstract class Card {

    private String number;
    private int payment;

    public Card(String number, int payment){
        this.number = number;
        this.payment = payment;
    }

    public String getNumber() {
        return number;
    }

    public int getPayment() {
        return payment;
    }
}
