package task1;

public class Fixed extends Employee{

    private String name;
    private int ID;
    private double fix;

    public Fixed(String name, int ID, double fix){
        super(name, ID, fix);
    }

    @Override
    public double employeeSalary() {
        return fix;
    }
}
