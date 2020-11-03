public class CAFE {
    public static void main(String[] args) {
        CreateFood foodMenu = new CreateFood();
        Tovar tovar1 = new Tovar("Салат", 300, "гр", 300, "Помидоры, огурцы, масло растительное, лук репчатый");
        foodMenu.add(tovar1);
        foodMenu.add(new Tovar("Курица", 450, "гр", 400, "Курица, чеснок"));
        foodMenu.stop(tovar1);
        foodMenu.print();

        CreateDrinks drinkMenu = new CreateDrinks();
        Tovar tovar2 = new Tovar("Виски", 500, "мл", 150, "Виски, лёд");
        drinkMenu.add(new Tovar("Кола", 300, "мл", 250, "Виски, лёд"));
        drinkMenu.add(tovar2);
        drinkMenu.stop(tovar2);
        drinkMenu.print();

        //System.out.println("!!!!!!!" + foodMenu.FoodMenu.size());
        //System.out.println("!!!!!!!" + drinkMenu.DrinkMenu.size());

        Table table = new Table(1);
        //добавление товара из меню в заказ
        table.toOrder(foodMenu.FoodMenu.get(0));
        table.toOrder(foodMenu.FoodMenu.get(1));
        table.toOrder(drinkMenu.DrinkMenu.get(0));
        table.toOrder(drinkMenu.DrinkMenu.get(1));
        table.myOrder();
        double total = table.close();
        System.out.print(total);
        System.out.println();

    }
}
