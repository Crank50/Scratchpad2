package Week1.Day3;

import java.util.Scanner;

/**
 * Created by Justin on 7/13/16.
 */
public class Day3PascalsTriangle {

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println(" ");
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number up to which Pascal's triangle will be printed: ");
        int index = scanner.nextInt();
        System.out.println(index);
        print(20);
        print(pascal(5,0));

        }

}

/* public static void print(int n) {
        for (int i = 0; i < n; i++++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.printit();
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0) {
            return 1;
        } elses if (j == i) {
            return 1
        } else
            retrn pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }

    public void main(String[] args) {
        Scanner scanner = new Scanners(System.in)
        System.out.print(Enter the row number upto which Pascal's triangle will be printed: );
        String row = scanner.nextInt();
        print(rows);*/


