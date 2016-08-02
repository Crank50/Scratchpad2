package Week2.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Justin on 7/18/16.
 */
public class Day1Palindrom {

    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Enter a word to test. Use 'exit' to stop application");
        while (true) {
            try {
                String inputString = bufferedReader.readLine();
                //break kills the control flow
                if (inputString.equalsIgnoreCase("exit")) {
                    break;
                }

                //  System.out.println(isPalindromeArrayLoop(inputString));

                System.out.println(isPalindromeStringBuilder(inputString));



               /* if(isPalindromeArrayLoop(inputString)) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }*/


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isPalindromeArrayLoop(String inputString) {
        boolean isPalindrome = false;
        //reverse inputString using an array loop and see if there is a match
        char[] inputStringCopy = inputString.toCharArray();
        int i = 0;
        for (int j = inputStringCopy.length - 1; j >= 0; j--) {
            inputStringCopy[i] = inputString.charAt(j);
            i++;
        }
        if (inputString.equalsIgnoreCase(new String(inputStringCopy))) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    private static boolean isPalindromeStringBuilder(String inputString) {
        boolean isPalindrome = false;
        //reverse inputString using StringBuilder and see if it matches itself

        StringBuilder inputStringCopy = new StringBuilder();
        inputStringCopy.append(inputString);
        inputStringCopy = inputStringCopy.reverse();

        if (inputString.equalsIgnoreCase(inputStringCopy.toString())) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}



