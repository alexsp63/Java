package task2;

public class Terminal {
    int prohod = 0;  //проходимость
    int money = 0;   //заработанные деньги
    int count = 0;   //количество поштучных
    int N;

    public Terminal(int N){
        this.N = N;
    }

    public void pay(Fixed fixed){
        prohod += 1;
        money += 0; //вряд ли за льготные категории деньги получает сам терминал
    }

    public void pay(Wallet wallet){
        if (wallet.getBalance() >= wallet.getPayment()) {
            prohod += 1;
            money += wallet.getPayment();
            wallet.setBalance(-wallet.getPayment());
        }
    }

    public void pay(OneTime oneTime){
        if (oneTime.flag == 0){
            prohod += 1;
            money += oneTime.getPayment();
            oneTime.setFlag();
            count += 1;
        }
    }

    public void stat(){
        System.out.println("Статистика по терминалу №" + N);
        System.out.println("Проходов: " + prohod);
        System.out.println("Получено денег: " + money);
        System.out.println("Штучных поездок: " + count);
    }
}
