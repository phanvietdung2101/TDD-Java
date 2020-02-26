package APJCaculator;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class NextDayCalculator {
    public static String nextDayCalculator(int inputDate, int inputMonth, int inputYear) {
        int outputDate, outputMonth, outputYear;
        outputDate = inputDate;
        outputMonth = inputMonth;
        outputYear = inputYear;

        boolean isInputValid = isInputDateValid(inputDate,inputMonth,inputYear);
        if(!isInputValid)
            return "Invalid input";

        int daysOfMonth;
        if(isMonthWith31Day(inputMonth))
            daysOfMonth = 31;
        else if(isMonthWith30Day(inputMonth))
            daysOfMonth = 30;
        else if(inputMonth == 2){
            if(isLeapYear(inputYear))
                daysOfMonth = 29;
            else
                daysOfMonth = 28;
        } else {
            return "Invalid input";
        }



        boolean isLastDayOfYear = inputMonth == 12 && inputDate == daysOfMonth;
        boolean isLastDayOfMonth = inputDate == daysOfMonth;
        if(isLastDayOfYear){
            outputDate = 1;
            outputMonth = 1;
            outputYear += 1;
        } else if (isLastDayOfMonth){
            outputDate = 1;
            outputMonth += 1;
        } else
            outputDate += 1;

        return outputDate + "-" + outputMonth + "-" + outputYear;
    }

    public static boolean isLeapYear ( int year){
        boolean isDivineByFour = year % 4 == 0;
        if (isDivineByFour) {
            boolean isDivineByAHundred = year % 100 == 0;
            if (isDivineByAHundred) {
                boolean isDivineByFourHundred = year % 400 == 0;
                if (isDivineByFourHundred) {
                    return true;
                } else
                    return false;
            } else
                return true;
        } else
            return false;
    }

    public static boolean isMonthWith31Day(int month){
        int[] monthWith31Days = new int[]{1,3,5,7,8,10,12};
        for(int element : monthWith31Days) {
            if(element == month)
                return true;
        }
        return false;
    }

    public static boolean isMonthWith30Day(int month){
        int[] monthWith30Days = new int[]{4, 6, 9, 11};
        for(int element : monthWith30Days) {
            if(element == month)
                return true;
        }
        return false;
    }

    public static boolean isInputDateValid(int date, int month, int year){
        if(date < 0 || date > 31)
            return false;
        if(month < 0 || month > 12)
            return false;
        if(year < 0 )
            return false;
        return true;
    }

//    public static int daysOfMonth(int month){
//
//    }

}
