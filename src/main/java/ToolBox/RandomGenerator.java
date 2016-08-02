package ToolBox;

import java.util.Random;
/**
 * Created by Justin on 7/14/16.
 */
public class RandomGenerator {

    public static int randomInt(int min, int max) {
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) + 1) + min;

        return randomNumber;
    }

    public static void main(String[] args) {
        System.out.println(randomInt2(12, 19));

    }

    public static int randomInt2(int min, int max) {
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) + 1) + min;

        return randomNumber;

    }

}




