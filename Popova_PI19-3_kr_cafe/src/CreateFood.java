import java.util.ArrayList;

public class CreateFood extends CreateMenu{

    ArrayList<Tovar> FoodMenu = new ArrayList<>();

    public void print(){
        System.out.println("***Меню еды: ");
        for (Tovar t: FoodMenu){
            System.out.println("Наименование: " + t.getName());
            System.out.println(" Цена: " + t.getPrice());
            System.out.println(" Единица измерения: " + t.getEz());
            System.out.println(" Кол-во в ед. измерения: " + t.getKez());
            System.out.print(" Состав: " + t.getFill());
            if (stops.contains(t)){
                System.out.print(" (СТОП)");
            }
            System.out.println();
        }
    }

    @Override
    public void add(Tovar tovar) {
        FoodMenu.add(tovar);
    }

    @Override
    public void stop(Tovar tovar) {
        stops.add(tovar);
        System.out.println("Блюдо " + tovar.getName() + " помещено в стоп-лист");
    }
}
