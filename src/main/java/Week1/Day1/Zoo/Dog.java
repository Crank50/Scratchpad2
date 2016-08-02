package Week1.Day1.Zoo;

/**
 * Created by Justin on 7/11/16.
 */
public class Dog extends Mammal{
    public Dog () {
        this.name = "Dog";
    }
        @Override
    public void makeSound() {
            System.out.println("Bark!");
        }

}

