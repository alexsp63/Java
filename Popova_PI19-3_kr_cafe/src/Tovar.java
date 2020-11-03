public class Tovar {

    private String name;
    private double price;
    private String ez; //ед. измерения
    private int kez; //кол-во в ед. измер.
    private String fill;

    public Tovar(String name, double price, String ez, int kez, String fill){
        this.name = name;
        this.price = price;
        this.ez = ez;
        this.kez = kez;
        this.fill = fill;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getEz() {
        return ez;
    }

    public int getKez() {
        return kez;
    }

    public String getFill() {
        return fill;
    }

}
