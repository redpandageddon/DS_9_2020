package types;

import java.io.Serializable;

public class staff implements Serializable {
    
    private String FIO;
    private int age;
    private String position;
    private double salary;

    public staff(String FIO, int age, String position, double salary) {
        this.FIO = FIO;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String getFIO() {
        return FIO;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
    
}
