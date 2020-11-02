package task1;

public class PerHour extends Employee{

    private final double salary;
    private String name;
    private int ID;
    private double rate;

    public PerHour(String name, int ID, int rate) {
        super(name, ID, 20.8 * 8 * rate);
        this.rate = rate;
        this.salary = 20.8 * 8 * rate;
    }

    @Override
    public double employeeSalary() {
        return 20.8 * 8 * rate;
    }
}
