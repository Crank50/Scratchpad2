package Week1.Day3;

/**
 * Created by Justin on 7/14/16.
 */
public class Day3CheckerBoard {
    public static void main(String[] args) {
        int size = 8;    // size of the board

        for (int row = 0; row <= size; row++) {
            boolean isEven = false;
            String printRow = " ";
            // Use modulus 2 to find alternate lines
            if ((row % 2) == 0) {   // row 2, 4, 6, 8
                    isEven = true;
            }

            for (int col = 0; col <= size; col++) {
                if(isEven) {
                    printRow = printRow+" * ";
                    isEven = false;
                } else {
                    isEven = true;
                    printRow = printRow + "X";

                }
                }

                    System.out.println(printRow);


                }

            }


        }







