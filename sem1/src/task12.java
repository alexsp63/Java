public class task12 {
    public static void main(String[] args) {
        System.out.println(distance(1, 2, 0, 2));
        System.out.println(distance(3, 4, 1, 2));
        System.out.println(distance(1, 2, 1, 2));
    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }
}
