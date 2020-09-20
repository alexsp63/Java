package task5;

public class TwoArrays {

    private int value[];
    private int valueW[];

    public TwoArrays(int[] value, int[] valueW){
        this.value = value;
        this.valueW = valueW;
    }

    public int randomReturn(){
        int newLength = 0;
        for (int i: valueW){
            newLength += i;
        }
        int[] forSelecting = new int[newLength];
        int k = 0;
        //это для заполнения массива числами с учётом их периодичности
        for (int i=0; i<valueW.length; i++){
            for (int j=0; j<valueW[i]; j++){
                forSelecting[k] = value[i];
                k++;
            }
        }
        return forSelecting[(int) (Math.random() * (forSelecting.length))];
    }

}
