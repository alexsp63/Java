package com.company;

public class Field {

    private String[][] myField;
    int a = 0;
    int b = 3;

    public Field(String[][] myField){
        this.myField = myField;
    }

    public void print(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(myField[i][j] + " ");
            }
            System.out.println();
        }
    }

    private Integer[] random(){
        int i = a + (int) (Math.random() * b);
        int j = a + (int) (Math.random() * b);
        Integer[] result = {i , j};
        return result;
    }

    public void generate(String symbol){
        boolean ok = false;
        while (!ok){
            int myI = random()[0];
            int myJ = random()[1];
            if (myField[myI][myJ] == "."){
                myField[myI][myJ] = symbol;
                ok = true;
            }
            else{
                continue;
            }
        }
    }

    public boolean checkEnd(String symbol){
        boolean end;
        if (((myField[0][0] == myField[1][1]) && (myField[0][0] == myField[2][2]) && (myField[0][0] == symbol)) ||
                ((myField[0][2] == myField[1][1]) && (myField[0][2] == myField[2][0]) && (myField[0][2] == symbol)) ||
                ((myField[0][0] == myField[0][1]) && (myField[0][0] == myField[0][2]) && (myField[0][0] == symbol)) ||
                ((myField[1][0] == myField[1][1]) && (myField[1][0] == myField[1][2]) && (myField[1][0] == symbol)) ||
                ((myField[2][0] == myField[2][1]) && (myField[2][0] == myField[2][2]) && (myField[2][0] == symbol)) ||
                ((myField[0][0] == myField[1][0]) && (myField[0][0] == myField[2][0]) && (myField[0][0] == symbol)) ||
                ((myField[0][1] == myField[1][1]) && (myField[0][1] == myField[2][1]) && (myField[0][1] == symbol)) ||
                ((myField[0][2] == myField[1][2]) && (myField[0][2] == myField[2][2]) && (myField[0][2] == symbol))){
            end = true;
            System.out.println("Win of " + symbol + "!!!");
        } else if ((myField[0][0] != ".") && (myField[0][1] != ".") && (myField[0][2] != ".") &&
                (myField[1][0] != ".") && (myField[1][1] != ".") && (myField[1][2] != ".") &&
                (myField[2][0] != ".") && (myField[2][1] != ".") && (myField[2][2] != ".")){
            end = true;
            System.out.println("Ничья!");
        } else {
            end = false;
        }
        return end;
    }
}
