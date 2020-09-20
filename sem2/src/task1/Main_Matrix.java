package task1;

public class Main_Matrix {
    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] m2 = {
                {1, 2},
                {3, 4},
        };
        int[][] m3 = {
                {2, 3, 4},
                {9, 8, 7},
                {2, 1, 0}
        };
        Matrix matrix1 = new Matrix(m1);
        Matrix matrix2 = new Matrix(m2);
        Matrix matrix3 = new Matrix(m3);

        System.out.println(matrix1.sum(matrix1.getM())); //матрица одинакового размера сама с собой
        System.out.println(matrix1.sum(matrix2.getM())); //а с этой матрицей - нет

        System.out.println(matrix1.sub(matrix1.getM()));
        System.out.println(matrix1.sub(matrix2.getM()));

        System.out.println(matrix1.number(3));
        System.out.println(matrix2.number(3));

        System.out.println(matrix1.mult(matrix2.getM()));
        System.out.println(matrix1.mult(matrix3.getM()));

        System.out.println(matrix2.trans());
        System.out.println(matrix3.trans());

        System.out.println(matrix2.deg(3));
        System.out.println(matrix3.deg(2));
    }

}
