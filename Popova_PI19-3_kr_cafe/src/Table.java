import java.util.ArrayList;

public class Table {

    private int N;
    ArrayList<Tovar> order = new ArrayList<>();

    public Table(int N){
        this.N = N;
    }

    public void toOrder(Tovar tovar){
        if (!CreateMenu.stops.contains(tovar)) //нет в стопе
            order.add(tovar);
        else
            System.out.println("Блюдо в стоп листе, нельзя добавить в заказ");
    }

    public void myOrder(){
        System.out.println("Заказ по столику №" + this.N);
        for (Tovar t: order){
            System.out.println("Наименование: " + t.getName() + ", цена: " + t.getPrice());
        }
    }

    public double close(){
        System.out.print("Заказ закрыт, к оплате ");
        double sum = 0;
        for (Tovar t: order){
            sum += t.getPrice();
        }
        return sum;
    }
}
