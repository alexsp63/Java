package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        PerHour employee1 = new PerHour("John", 1234, 20);
        PerHour employee2 = new PerHour("Mike", 2341, 19);
        PerHour employee3 = new PerHour("Alla", 5621, 21);
        PerHour employee4 = new PerHour("Jake", 6745, 20);
        Fixed employee5 = new Fixed("Anna", 9765, 3500);
        Fixed employee6 = new Fixed("Mary", 6745, 5000);

        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(employee1);
        list1.add(employee2);
        list1.add(employee3);
        list1.add(employee4);
        list1.add(employee5);
        list1.add(employee6);

        Comparator<Employee> comparatorI = Comparator.comparing(e -> e.getSalary());
        comparatorI = comparatorI.reversed();
        list1.sort(comparatorI);

        System.out.println("Сортировка по зарплате:");
        for (Employee e: list1){
            System.out.println("Имя: " + e.getName() + " ID: " + e.getID() + " ЗП: " + e.getSalary());
        }
        System.out.println();

        Comparator<Employee> comparatorII = Comparator.comparing(e -> e.getSalary());
        comparatorII = comparatorII.reversed().thenComparing(e -> e.getName());
        list1.sort(comparatorII);

        System.out.println("Сортировка по зарплате и имени:");
        for (Employee e: list1){
            System.out.println("Имя: " + e.getName() + " ID: " + e.getID() + " ЗП: " + e.getSalary());
        }
        System.out.println();

        System.out.println("Первые 5 имён работников:");
        for (int i=0; i<5; i++){
            System.out.println("Имя: " + list1.get(i).getName());
        }
        System.out.println();

        System.out.println("Последние 3 идентификатора:");
        for (int i = list1.size()-3; i < list1.size(); i++){
            System.out.println("Имя: " + list1.get(i).getID());
        }
        System.out.println();

        //запись в файл

        try {
            FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\1\\Desktop\\2 курс\\Java\\PreparingForTheTest\\src\\task1\\task1.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Employee e: list1){
                oos.writeObject(e);
            }
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //чтение из файла

        System.out.println("Чтение из файла по ID: ");
        try{
            FileInputStream fis = new FileInputStream(new File("C:\\Users\\1\\Desktop\\2 курс\\Java\\PreparingForTheTest\\src\\task1\\task1.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee e1 = (Employee) ois.readObject();
            Employee e2 = (Employee) ois.readObject();
            Employee e3 = (Employee) ois.readObject();
            Employee e4 = (Employee) ois.readObject();
            Employee e5 = (Employee) ois.readObject();
            Employee e6 = (Employee) ois.readObject();
            System.out.println(e1.getID());
            System.out.println(e2.getID());
            System.out.println(e3.getID());
            System.out.println(e4.getID());
            System.out.println(e5.getID());
            System.out.println(e6.getID());
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
