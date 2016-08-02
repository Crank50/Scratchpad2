package Week1.Day1.Zoo;

/**
 * Created by Justin on 7/11/16.
 */
public class Hawk extends Bird {
    public Hawk () {
        this.name = "Hawk";
    }
    @Override
    public void makeSound() {
        System.out.println("Cawwwww!");
    }
}
