package ToolBox;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

import static java.time.temporal.ChronoUnit.YEARS;

/**
 * Created by Justin on 8/16/16.
 */
public class Datetime {

    public static void main(String[] args) {
        //retrieves todays date
        getCurrentDate();
        //retrieves todays date and time
        getCurrentDateTime();
        // retrieves individual Year : Month: Day
        getCurrentDayMonthYear();
        //Prints DOB but is not Static i.e Anniversary, Holocaust
        getSpecificDate(2012,10,10);
        //Retrives current local time
        getCurrentTime();
        //Retrieves local date and time in Iran*** view other timezones in print out
        getCurrentZonedDateTime("Iran");
        //Prints local timezone
        getCurrentLocalClock();
        //misc
        getCurrentUTCClock();
        //specific date and todays date are similar?
        isSameDates(1983,3,05);
        //Is today my birthday? from specified date
        isAnniversary(1993,8,12);
        //is current date after the specified date?
        isDateAfter(getCurrentDate(), getSpecificDate(2612,5,10));
        //is specified date before current date?
        isDateBefore(getSpecificDate(1,1,1), getCurrentDate());
        //is current date between the 2 specified dates
        isDateBetween(getSpecificDate(1476,1,27), getCurrentDate(), getSpecificDate(2009,7,15));
        //Checks calendar to confirm if this year is a leap year
        isLeapYear(2026);
        //adds specified hours to current time
        addHours(24);
        //adds specified weeks to current date
        addWeeks(48);
        //subtracts specified year to current date
        subtractYears(10);
        //turns current date into a specified format {MMM DD YYYY}
        dateToPrettyString(getCurrentDateTime());
        //Calculates the days between current date and specified date
        daysBetweenDates(getCurrentDate(),getSpecificDate(2801,2,7));
        //requires a special format to be read
        defaultFormatting("20190811");
        //enter a year and a month** refers to calendar
        howManyDaysInAMonth(2002, 8);
        //requires special formating {MMM DD YYYY}
        customFormatting("Feb 12 2008");
        //does what it says
        printAllTimeZones();


    }

    private static LocalDate getCurrentDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date : " + today);
        return today;
    }

    private static LocalDateTime getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The current Local date and time : " + now);
        return now;
    }

    private static void getCurrentDayMonthYear() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("Year : %d Month : %d day : %d \t %n", year, month, day);
    }

    private static LocalDate getSpecificDate(int year, int month, int day) {
        LocalDate specificDate = LocalDate.of(year, month, day);
        System.out.println("Your Date of birth is : " + specificDate);
        return specificDate;
    }

    private static boolean isSameDates(int year, int month, int day) {
        LocalDate testDate = getSpecificDate(year, month, day);
        LocalDate today = getCurrentDate();
        boolean isSameDate = false;
        if(testDate.equals(today)){
            System.out.printf("Today %s and date1 %s are the same date %n", today, testDate);
            isSameDate = true;
        } else {
            System.out.printf("Today %s and date1 %s are NOT the same date %n", today, testDate);
        }
        return isSameDate;
    }

    private static boolean isAnniversary(int year, int month, int day) {
        LocalDate originalDate = getSpecificDate(year, month, day);
        LocalDate today = getCurrentDate();
        boolean isAnnualRecurrance = false;
        MonthDay anniversary = MonthDay.of(originalDate.getMonth(), originalDate.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);
        if(currentMonthDay.equals(anniversary)){
            System.out.println("Today is the anniversary!!");
            isAnnualRecurrance = true;
        } else {
            System.out.println("Today is NOT the anniversary.");
        }
        return isAnnualRecurrance;
    }


    private static LocalTime getCurrentTime() {
        LocalTime time = LocalTime.now();
        System.out.println("local time now : " + time);
        return time;
    }

    private static LocalTime addHours(int hours) {
        LocalTime time = getCurrentTime();
        LocalTime newTime = time.plusHours(hours);
        System.out.println("Time after "+hours+" hours : " + newTime);
        return newTime;
    }

    private static LocalDate addWeeks(int weeks) {
        LocalDate today = getCurrentDate();
        LocalDate newDate = today.plus(weeks, ChronoUnit.WEEKS);
        System.out.println("Today is : " + today);
        System.out.println("Date after "+weeks+" week(s) : " + newDate);
        return newDate;
    }

    private static LocalDate subtractYears(int years) {
        LocalDate today = getCurrentDate();
        LocalDate newDate = today.minus(1, YEARS);
        System.out.println("Date, "+years+" year(s) ago : " + newDate);
        return newDate;
    }

    private static Clock getCurrentUTCClock() {
        Clock clock = Clock.systemUTC();
        System.out.println("UTC Clock : " + clock);
        return clock;
    }

    private static Clock getCurrentLocalClock() {
        Clock clock = Clock.systemDefaultZone();
        System.out.println("Local Time Zone Clock : " + clock);
        return clock;
    }

    private static boolean isDateBefore(LocalDate testDate, LocalDate isBeforeDate) {
        boolean isBefore = false;
        if(testDate.isBefore(isBeforeDate)){
            System.out.println(testDate+" is before "+isBeforeDate);
            isBefore = true;
        } else {
            System.out.println(testDate+" is NOT before "+isBeforeDate);
        }
        return isBefore;
    }

    private static boolean isDateAfter(LocalDate testDate, LocalDate isAfterDate) {
        boolean isBefore = false;
        if(testDate.isAfter(isAfterDate)){
            System.out.println(testDate+" is after "+isAfterDate);
            isBefore = true;
        } else {
            System.out.println(testDate+" is NOT after "+isAfterDate);
        }
        return isBefore;
    }

    private static boolean isDateBetween(LocalDate testDate, LocalDate rangeStartDate, LocalDate rangeEndDate) {
        boolean isDateWithinRange = false;
        if(isDateAfter(testDate,rangeStartDate) && isDateBefore(testDate,rangeEndDate)) {
            System.out.println(testDate+" is between "+rangeStartDate+" and "+rangeEndDate);
            isDateWithinRange = true;
        } else {
            System.out.println(testDate+" is NOT between "+rangeStartDate+" and "+rangeEndDate);
        }
        return isDateWithinRange;
    }

    private static int daysBetweenDates(LocalDate start, LocalDate end) {
        Period daysBetween = Period.between(start, end);
        System.out.println("There are "+daysBetween.getDays()+" days between "+start+" and "+end);
        System.out.println("There are "+daysBetween.getMonths()+" months between "+start+" and "+end);
        System.out.println("There are "+daysBetween.getYears()+" years between "+start+" and "+end);
        return daysBetween.getDays();
    }

    private static void printAllTimeZones() {
        String[] allTimeZones = TimeZone.getAvailableIDs();
        System.out.println("TIME ZONE: ---------------------------------------------- ");
        for(String timeZone : allTimeZones) {
            System.out.println("TIME ZONE: "+timeZone);
        }
        System.out.println("TIME ZONE: ---------------------------------------------- ");
    }

    private static ZonedDateTime getCurrentZonedDateTime(String timeZone) {
        ZoneId requestedZone = ZoneId.of(timeZone);
        LocalDateTime here = getCurrentDateTime();
        ZonedDateTime there = ZonedDateTime.of(here,requestedZone);
        System.out.println("The current date and time in "+requestedZone+" is: "+there);
        return there;
    }

    private static int howManyDaysInAMonth(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year,month);
        int daysInMonth = yearMonth.lengthOfMonth();
        System.out.printf("Days in month year %s: %d%n", yearMonth, daysInMonth);
        return daysInMonth;
    }

    private static boolean isLeapYear(int year) {
        LocalDate today = getCurrentDate();
        LocalDate checkYear = getSpecificDate(year,today.getMonthValue(),today.getDayOfMonth());
        boolean isLeapYear = false;
        if(checkYear.isLeapYear()) {
            System.out.println(year+" is a leap year");
            isLeapYear = true;
        } else {
            System.out.println(year+" is NOT a leap year");
        }
        return isLeapYear;
    }

    private static void defaultFormatting(String basicIsoDate) {
        LocalDate formattedDate = LocalDate.parse(basicIsoDate, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date generated from String %s is %s %n", basicIsoDate, formattedDate);
    }

    private static void customFormatting(String prettyDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
            LocalDate formattedDate = LocalDate.parse(prettyDate, formatter);
            System.out.printf("Successfully parsed String %s, date is %s%n", prettyDate, formattedDate);
        } catch (DateTimeParseException ex) {
            System.out.printf("%s is not parsable!%n", prettyDate);
            ex.printStackTrace();
        }
    }

    private static String dateToPrettyString(LocalDateTime myDateTime) {
        String prettyString = null;
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm a");
            prettyString = myDateTime.format(format);
            System.out.printf("Pretty date time String : %s %n", prettyString);
        } catch (DateTimeException ex) {
            System.out.printf("%s can't be formatted!%n", myDateTime);
            ex.printStackTrace();
        }
        return prettyString;
    }

}
