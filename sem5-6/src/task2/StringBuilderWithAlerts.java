package task2;

import java.util.HashMap;

public class StringBuilderWithAlerts implements Alerts{

    public StringBuilder stringBuilder;
    //слушатель
    public Listener MyListener;
    public HashMap<StringBuilder, Listener> findListener = new HashMap<>();

    public StringBuilderWithAlerts(String str){
        stringBuilder = new StringBuilder(str);
    }

    public void setListener(Listener myListener) {
        this.MyListener = myListener;
    }

    public void print(){
        //это не считается за изменение состояния
        System.out.print(stringBuilder.toString() + "\n");
    }

    public StringBuilderWithAlerts append(String add){
        stringBuilder.append(add);
        findListener.put(stringBuilder, MyListener);
        return this;
    }

    public StringBuilderWithAlerts reverse(){
        stringBuilder.reverse();
        findListener.put(stringBuilder, MyListener);
        return this;
    }

    public StringBuilderWithAlerts delete(int start, int end){
        stringBuilder.delete(start, end);
        findListener.put(stringBuilder, MyListener);
        return this;
    }

    public StringBuilderWithAlerts replace(int start, int end, String rep){
        stringBuilder.replace(start, end, rep);
        findListener.put(stringBuilder, MyListener);
        return this;
    }

    @Override
    public void isChangeHappened() {
        if (findListener.containsKey(stringBuilder)) {
            //не главное, сколько раз менялся объект, главное, что он менялся, но это можно проверять и после каждого изменения
            System.out.println(stringBuilder);
            System.out.println("Слушатель " + findListener.get(stringBuilder) + "! Ваш объект изменился!");
        }
    }
}
