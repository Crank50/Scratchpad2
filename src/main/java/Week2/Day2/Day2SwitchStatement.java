package Week2.Day2;

/**
 * Created by Justin on 7/19/16.
 */
public class Day2SwitchStatement {
    private static int monthInt = 8;
    private static String monthString = "July";

    public static void main(String[] args) {
        System.out.println("The " + monthInt + "th month is " + intSwitchMonth(monthInt) + ".");
        System.out.println(monthString + " is the " + StringSwitchMonth(monthString) + "th month of the year.");
    }

    private static String intSwitchMonth(int month) {
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "Jan";
                break;

            case 2:
                monthString = "Feb";
                break;

            case 3:
                monthString = "March";
                break;


            case 4:
                monthString = "April";
                break;


            case 5:
                monthString = "May";
                break;


            case 6:
                monthString = "June";
                break;


            case 7:
                monthString = "July";
                break;


            case 8:
                monthString = "August";
                break;


            case 9:
                monthString = "Sept";
                break;


            case 10:
                monthString = "Oct";
                break;


            case 11:
                monthString = "Nov";
                break;


            case 12:
                monthString = "Dec";
                break;

            default:
                monthString = "Invalid Month";
                break;
        }
        return monthString;
    }


    private static int StringSwitchMonth(String month) {
        int monthNumber = 0;
        if (month == null) {
            return monthNumber;
        }
        monthString = month.toLowerCase();

        switch (month) {
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;

        }
        return monthNumber;
    }

}

