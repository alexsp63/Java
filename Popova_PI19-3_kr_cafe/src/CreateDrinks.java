import java.util.ArrayList;

public class CreateDrinks extends CreateMenu{

    ArrayList<Tovar> DrinkMenu = new ArrayList<>();

    public void print(){
        System.out.println("***Меню напитков: ");
        for (Tovar t: DrinkMenu){
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
        DrinkMenu.add(tovar);
    }

    @Override
    public void stop(Tovar tovar) {
        stops.add(tovar);
        System.out.println("Напиток " + tovar.getName() + " помещён в стоп-лист");
    }
}
