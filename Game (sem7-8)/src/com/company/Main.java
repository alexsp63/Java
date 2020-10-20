package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] field1 = new  String[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                String empty = ".";
                field1[i][j] = empty;
            }
        }
        Field field = new Field(field1);
        field.print();
        boolean end = false;
        int move = 1;
        while (!end){
            if (move % 2 == 1){
                //крестики
                field.generate("x");
                end = field.checkEnd("x");
            }
            else{
                //нолики
                field.generate("o");
                end = field.checkEnd("o");
            }
            field.print();
            System.out.println();
            move += 1;
        }
    }
}
