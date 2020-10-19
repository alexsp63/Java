package Converter;

public class Conversion {

    public static void main(String[] args) {
        double C1 = 30;
        double F1;
        double C11;
        F1 = new toF().getResult(C1);
        C11 = new toF().back(F1);
        System.out.println("Конвертация " + C1 + "С в F: " + F1);
        System.out.println("И назад: " + C11 + "C");
    }
}
