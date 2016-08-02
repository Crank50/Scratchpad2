package Week1.Day1.People;

/**
 * Created by Justin on 7/11/16.
 */
public class Student extends Person {
    private double gpa;

    public Student() {
        gpa = 4.0;
        setName("bob");
        setGender("male");
        setAge(12);

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
