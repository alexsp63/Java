package task1;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"a", "b", "c"},
                                             {"d", "e", "f"}};
        IteratorMatrix<String> myArray = new IteratorMatrix<>(arr);
        System.out.println(myArray.iterator().next());
    }
}
