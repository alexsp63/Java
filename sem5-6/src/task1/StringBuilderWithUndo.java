package task1;

import java.util.Stack;
import java.io.*;


public class StringBuilderWithUndo implements undoAction{
    //делегирую
    public StringBuilder stringBuilder;
    //стек для хранения строки перед выполнением операции
    public Stack<StringBuilder> actionStack = new Stack<>();

    public StringBuilderWithUndo(String str){
        stringBuilder = new StringBuilder(str);
    }

    public void print(){
        System.out.print(stringBuilder.toString() + "\n");
    }

    //Аналог deepcopy
    public static Object clone(Object source) {
        Object retVal = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(source);
            oos.flush();
            oos.close();
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
            retVal = in.readObject();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return retVal;
    }

    public StringBuilderWithUndo append(String add){
        System.out.print("Добавление: ");
        StringBuilder oldString = (StringBuilder) clone(stringBuilder);
        actionStack.push(oldString);
        stringBuilder.append(add);
        //System.out.println(actionStack);
        return this;
    }

    public StringBuilderWithUndo reverse(){
        System.out.print("Реверс: ");
        StringBuilder oldString = (StringBuilder) clone(stringBuilder);
        stringBuilder.reverse();
        actionStack.push(oldString);
        //System.out.println(actionStack);
        return this;
    }

    public StringBuilderWithUndo delete(int start, int end){
        System.out.print("Удаление: ");
        StringBuilder oldString = (StringBuilder) clone(stringBuilder);
        stringBuilder.delete(start, end);
        actionStack.push(oldString);
        //System.out.println(actionStack);
        return this;
    }

    public StringBuilderWithUndo replace(int start, int end, String rep){
        System.out.print("Замена: ");
        StringBuilder oldString = (StringBuilder) clone(stringBuilder);
        stringBuilder.replace(start, end, rep);
        actionStack.push(oldString);
        //System.out.println(actionStack);
        return this;
    }

    @Override
    public StringBuilderWithUndo undo() {
        if (!actionStack.isEmpty()){
            System.out.println("Отмена действия:");
            stringBuilder = actionStack.pop();
        } else {
            stringBuilder = new StringBuilder("Пусто!");
        }
        return this;
    }
}
