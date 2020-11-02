package task2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1234567890");
        School school1 = new School("0987654321");
        Social social1 = new Social("2341567834");
        Wallet wallet1 = new Wallet("7845621398", 500);
        OneTime oneTime1 = new OneTime("5487324694");

        ATM atm1 = new ATM(123);
        MobilePhone mobilePhone1 = new MobilePhone("Samsung");

        atm1.add(student1, 670);
        atm1.add(school1, 500);
        atm1.add(social1, 650);
        atm1.add(wallet1, 100);
        System.out.println();

        mobilePhone1.add(student1, 670);
        mobilePhone1.add(school1, 500);
        mobilePhone1.add(social1, 650);
        mobilePhone1.add(wallet1, 200);

        System.out.println();

        Terminal terminal1 = new Terminal(1);
        terminal1.pay(student1);
        terminal1.pay(school1);
        terminal1.pay(social1);
        terminal1.pay(wallet1);
        terminal1.pay(oneTime1);
        terminal1.pay(new OneTime("547635"));
        terminal1.pay(new OneTime("664783"));
        terminal1.stat();

    }
}
