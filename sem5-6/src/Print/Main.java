package Print;

public class Main {
    public static void main(String[] args) {
        Print book = new Print("asdf", "ghv");
        book.print();
    }
}

interface Printable{
    void print();
}
