package task2;

public class Vector {

    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public double length(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double scalarProduct(int x2, int y2, int z2){
        return x*x2 + y*y2 + z*z2;
    }

    public String vectorProduct(int x2, int y2, int z2){
        double new_x = y*z2 - z*y2;
        double new_y = z*x2 - x*z2;
        double new_z = x*y2 - y*x2;
        return "(" + Double.toString(new_x) + "; " + Double.toString(new_y) + "; " + Double.toString(new_z) + ")";
    }

    public Double angle(int x2, int y2, int z2){
        double cos = scalarProduct(x2, y2, z2)/(length()*Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2) + Math.pow(z2, 2)));
        return Math.toDegrees(Math.acos(cos));
    }

    public String sum(int x2, int y2, int z2){
        return "(" + Integer.toString(x+x2) + "; " + Integer.toString(y+y2) + "; " + Integer.toString(z+z2) + ")";
    }

    public String sub(int x2, int y2, int z2){
        return "(" + Integer.toString(x-x2) + "; " + Integer.toString(y-y2) + "; " + Integer.toString(z-z2) + ")";
    }

    public static int[][] randomArray(int N){
        int[][] result = new int[N][3];
        for (int i=0; i<N; i++){
            for (int j=0; j<result[0].length; j++){
                result[i][j] = (int) (Math.random()*201-100);
            }
        }
        return result;
    }
}
