package task2;

public class OneTime extends EveryTime{

    int flag = 0;

    public OneTime(String number) {
        super(number, 55);
    }

    public int flag(){
        return flag;
    }

    public void setFlag(){
        flag = 1;
    }

}
