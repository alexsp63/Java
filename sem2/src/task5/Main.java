package task5;

public class Main {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3};
        int[] ar2 = {1, 2, 10};
        TwoArrays example1 = new TwoArrays(ar1, ar2);
        System.out.println("Рандомное число по условию: " + example1.randomReturn());
    }
}