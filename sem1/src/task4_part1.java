public class task4_part1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int c;
        System.out.println("x = " + x + ", y = " + y);
        c = x;
        x = y;
        y = c;
        System.out.println("x = " + x + ", y = " + y);
    }
}
