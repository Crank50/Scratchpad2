package Week2.day1;

/**
 * Created by Justin on 7/18/16.
 */

public class Day1TimesTable {

    public static void main(String[] args) {
        int tableSize = 200;
        printTimesTable(tableSize);
    }

    public static void printTimesTable(int tableSize) {
        // first print the top header row using a for-loop
        System.out.format("      ");
        for (int i = 1; i <= tableSize; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");

        // create another for-loop to start building the rows
        for (int j = 1; j <= tableSize; j++) {
            // print left most column first
            System.out.format("%4d |", j);

            // create another loop to fill in the multiplied columns
            for (int y = 1; y <= tableSize; y++) {
                System.out.format("%4d", j * y);
            }
            System.out.println();
        }
    }
}


