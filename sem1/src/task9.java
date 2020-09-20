public class task9 {
    public static void main(String[] args) {
        System.out.println(dif_21(50));
        System.out.println(dif_21(30));
        System.out.println(dif_21(21));
        System.out.println(dif_21(-1));
    }
    public static int dif_21(int n){

        return Math.abs(n - 21);
    }
}
