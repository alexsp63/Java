package task2;

public class Listener {
    //в задании сказано, что слушатели - это объекты
    public String listener;

    public String toString(){
        return listener.toString();
    }

    public Listener(String listener){
        this.listener = listener;
    }
}
