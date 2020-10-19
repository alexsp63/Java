package Print;

public class Print implements Printable {
    private String author;
    private String name;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Print(String name, String author){
        this.author = author;
        this.name = name;
    }

    @Override
    public void print(){
        System.out.printf("%s (%s)", name, author);
    }

}
