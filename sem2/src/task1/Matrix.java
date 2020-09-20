package task1;

public class Matrix {

    private int m[][];

    public Matrix(int m[][]){
        this.m = m;
    }

    public int[][] getM() {
        return m;
    }

    public void print(int m[][]){
        for (int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String toStr(int m[][]){
        String s = "";
        for (int i=0; i<m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                s += Integer.toString(m[i][j]);
                s += " ";
            }
            s += "\n";
        }
        return s;
    }

    public boolean eqSize(int m[][], int m2[][]){
        if(m.length == m2.length && m[0].length == m2[0].length){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean eqSizeM(int m[][], int m2[][]){
        if (m[0].length == m2.length){
            return true;
        }
        else{
            return false;
        }
    }

    public int[][] MM(int m[][], int m2[][]){
        //произведение
        int result[][] = new int[m.length][m2[0].length];
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m2[0].length; j++){
                result[i][j] = 0;
            }
        }
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m2[0].length; j++){
                for (int k = 0; k< m2.length; k++){
                    result[i][j] += m[i][k]*m2[k][j];
                }
            }
        }
        return result;
    }

    public String sum(int m2[][]){
        //сумма
        boolean check = eqSize(m, m2);
        String end_result = "";
        if (check){
            int result[][] = new int[m.length][m2[0].length];
            for (int i=0; i<result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = m[i][j] + m2[i][j];
                }
            }
            end_result += "Результат сложения матрицы \n";
            end_result += toStr(m);
            end_result += "И матрицы \n";
            end_result += toStr(m2);
            end_result += "Равен: \n";
            end_result += toStr(result);
        }
        else{
            end_result += "Матрицу \n";
            end_result += toStr(m);
            end_result += "И матрицу \n";
            end_result += toStr(m2);
            end_result += "Нельзя сложить! \n";
        }
        return end_result;
    }

    public String sub(int m2[][]){
        //разность
        boolean check = eqSize(m, m2);
        String end_result = "";
        if (check){
            int result[][] = new int[m.length][m2[0].length];
            for (int i=0; i<result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = m[i][j] - m2[i][j];
                }
            }
            end_result += "Результат вычитания матрицы \n";
            end_result += toStr(m);
            end_result += "И матрицы \n";
            end_result += toStr(m2);
            end_result += "Равен: \n";
            end_result += toStr(result);
        }
        else{
            end_result += "Матрицу \n";
            end_result += toStr(m);
            end_result += "И матрицу \n";
            end_result += toStr(m2);
            end_result += "Нельзя вычитать! \n";
        }
        return end_result;
    }

    public String number(int n){
        //умножение на число
        //не нужно дополнительных проверок, можно умножить всегда
        String end_result = "";
        int result[][] = new int[m.length][m[0].length];
        for (int i=0; i< m.length; i++){
            for (int j=0; j<m[0].length; j++){
                result[i][j] = n*m[i][j];
            }
        }
        end_result += "Результат умножения матрицы \n";
        end_result += toStr(m);
        end_result += "На число " + Integer.toString(n) + " равен: \n";
        end_result += toStr(result);
        return end_result;
    }

    public String mult(int m2[][]){
        //произведение матриц
        String end_result = "";
        if (eqSizeM(m, m2)){
            int result[][] = MM(m, m2);
            end_result += "Результат умножения матрицы \n";
            end_result += toStr(m);
            end_result += "На матрицу \n";
            end_result += toStr(m2);
            end_result += "Равен \n";
            end_result += toStr(result);
        }
        else{
            end_result += "Матрицы \n";
            end_result += toStr(m);
            end_result += "И \n";
            end_result += toStr(m2);
            end_result += "Нельзя перемножить! \n";
        }
        return end_result;
    }

    public String trans(){
        //транспонирование
        String end_result = "";
        int result[][] = new int[m.length][m[0].length];
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                result[i][j] = m[j][i];
            }
        }
        end_result += "Матрица \n";
        end_result += toStr(m);
        end_result += "Транспонированная матрица: \n";
        end_result += toStr(result);
        return(end_result);
    }

    public String deg(int n){
        //возведение в степень
        String end_result = "";
        int result[][] = m;
        int counter = 1;
        while (counter < n){
            result = MM(result, m);
            counter++;
        }
        end_result += "Матрица: \n";
        end_result += toStr(m);
        end_result += "Матрица^" + Integer.toString(n) + "\n";
        end_result += toStr(result);
        return end_result;
    }
}


