package Week1.Day3;

/**
 * Created by Justin on 7/14/16.
 */
public class RecursionglotIO {
    public static void main(String[] args) {
        myRecursiveMethod(80);
    }

    public static int myRecursiveMethod (int aVariable) {
        System.out.print(aVariable);
        aVariable--;
        if (aVariable == 0) {
            return 0;
        }
        return myRecursiveMethod(aVariable);
    }
}
