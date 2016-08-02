package Week1.Day1.Zoo;

/**
 * Created by Justin on 7/11/16.
 */
public class Animal {
    String name;

    public void makeSound() {
        System.out.println("Animal Sound!");
     }
    @Override
    public String toString() {
        return this.name;
    }
}
