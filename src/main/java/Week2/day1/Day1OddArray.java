package Week2.day1;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Justin on 7/18/16.
 */
public class Day1OddArray {
    private List<int[]> arrayHolder = new ArrayList<int[]>();

    public static void main(String[] args) {
        Day1OddArray oddArray = new Day1OddArray();
        oddArray.initializeNumberHolder();
        oddArray.checkOddArrays();
    }

    private void initializeNumberHolder() {
        System.out.println("populating arrays");
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 16, 18, 19});
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18});
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17});
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16});
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14});
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        arrayHolder.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        arrayHolder.add(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10});
        arrayHolder.add(new int[]{3, 4, 5, 6, 7, 8, 9, 10});
        arrayHolder.add(new int[]{4, 5, 6, 7, 8, 9, 10});
        arrayHolder.add(new int[]{6, 7, 8, 9, 10});
        arrayHolder.add(new int[]{7, 8, 9, 10});
        arrayHolder.add(new int[]{8, 9, 10});
        System.out.println("arrays populated");
    }

    private void checkOddArrays() {
        //loop through the ArrayList and pull out the int[]s
        for (int[] intHolder : arrayHolder) {

            if (isOddCount(intHolder) && isSummedOdd(intHolder)) {
                System.out.println("ODD MATCH");
            } else {
                System.out.println("REJECTED");
            }
        }
    }
    //As you pull out each int[], check the count for odd
    // and the sum for odd

    //if both are odd, print "ODD MATCH", else print "REJECTED"


    private boolean isOddCount(int[] intHolder) {
        // count the number of ints in the int[]
        // if odd, return true, else return false
        boolean isOdd = false;
        // int arraySize = intHolder.length; this is a secondary option by switching arraySize for intHolder.Length --
        // use of arraySize is useable in other methods
        if (!(intHolder.length % 2 == 0)) {
            isOdd = true;
        }
        return isOdd;
    }

    private boolean isSummedOdd(int[] intHolder) {
        // sum the ints in the int[]
        // if they equal an odd number, return true, else return false
        boolean isOdd = false;
        int sum = 0;
        for (int i : intHolder) {
            sum += i;
        }
        if (!(sum % 2 == 0)) {
            isOdd = true;
        }
        return isOdd;
    }
}


