package Week1.Day3;

/**
 * Created by Justin on 7/14/16.
 */
public class Day3FibonacciwithRecursion {
    static int n1=0, n2=1, n3=0;

    public static void main(String args[]){
        int count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }

    static void printFibonacci(int count){
        if(count> 0){
            // Start by setting n3, n2, and n1
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            // use recursion and pass in the new count
            printFibonacci(count-1);
        }
    }

}

/*package Week1.Day3;


 * Created by Justin on 7/14/16.

public class Day3FibonacciwithRecursion {
    static int n1=0, n2=1, n3=0;

    public static void main(String args[]){
        Day3FibonacciwithRecursion d3f = new Day3FibonacciwithRecursion();
    }int count=10;
    System.out.print(d3f.n1+""+d3f.n2);//printing 0 and 1
        d3f.printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }

    static void printFibonacci(int count){
        if(count> 0){
            // Start by setting n3, n2, and n1
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            // use recursion and pass in the new count
            printFibonacci(count-1);
        }
    }
*/