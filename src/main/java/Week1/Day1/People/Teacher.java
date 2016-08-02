package Week1.Day1.People;

/**
 * Created by Justin on 7/11/16.
 */
public class Teacher extends Person {
    private double salary;

    public static boolean isAlive = true;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
