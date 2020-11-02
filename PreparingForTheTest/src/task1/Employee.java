package task1;

public abstract class Employee implements java.io.Serializable{

    private String name;
    private int ID;
    private double salary;

    public Employee(String name, int ID, double salary){
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public abstract double employeeSalary();

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
