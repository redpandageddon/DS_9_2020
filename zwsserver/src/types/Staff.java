package types;

public class Staff {

    private String FIO;
    private int age;
    private String position;
    private double salary;

    public Staff() {
    }

    public Staff(String FIO, int age, String position, double salary) {
        this.FIO = FIO;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
