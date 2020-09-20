package task2;

public class Main_Vector {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);

        System.out.println("Длина вектора 1 = " + vector1.length());
        System.out.println("Длина вектора 2 = " + vector2.length());
        System.out.println();
        System.out.println("Скалярное произведение 1 и 2 = " + vector1.scalarProduct(vector2.getX(), vector2.getY(), vector2.getZ()));
        System.out.println();
        System.out.println("Векторное произведение 1 и 2 = " + vector1.vectorProduct(vector2.getX(), vector2.getY(), vector2.getZ()));
        System.out.println();
        System.out.println("Угол между 1 и 2 = " + vector1.angle(vector2.getX(), vector2.getY(), vector2.getZ()) + "°");
        System.out.println();
        System.out.println("Сумма 1 и 2 = " + vector1.sum(vector2.getX(), vector2.getY(), vector2.getZ()));
        System.out.println();
        System.out.println("Разность 1 и 2 = " + vector1.sub(vector2.getX(), vector2.getY(), vector2.getZ()));
        System.out.println();
        int N = 7;
        System.out.println("Рандомный массив размером " + Integer.toString(N) + " случайных векторов: ");
        int r[][] = vector1.randomArray(N);
        for (int i=0; i<N; i++){
            System.out.println("(" + r[i][0]  + "; " +  r[i][1] + "; " + r[i][2] + ")");
        }
    }
}
