package APJCaculator;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class NextDayCalculator {
    public static String nextDayCalculator(int inputDay,int inputMonth,int inputYear){
        Calendar date = Calendar.getInstance();
//        date.set(inputYear,inputMonth,inputDay);
        date.set(Calendar.YEAR, inputYear);
        date.set(Calendar.MONTH, inputMonth);
        date.set(Calendar.DATE, inputDay);
        System.out.println(date.get(Calendar.DATE) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.YEAR));
        date.add(Calendar.DATE, 1);
        return date.get(Calendar.DATE) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.YEAR);
    }

    public static boolean isLeapYear(int year){
        boolean isDivineByFour = year % 4 == 0;
        if(isDivineByFour){
            boolean isDivineByAHundred = year % 100 == 0;
            if(isDivineByAHundred){
                boolean isDivineByFourHundred = year % 400 == 0;
                if(isDivineByFourHundred){
                    return true;
                } else
                    return false;
            } else
                return true;
        } else
            return false;
    }

    public static String test() {
        String dt = "2008-02-29";  // Start date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(dt));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.add(Calendar.DATE, 1);  // number of days to add
        dt = sdf.format(c.getTime());  // dt is now the new date
        return dt;
    }

    public static void main(String[] args) {
        System.out.println(nextDayCalculator(31,1,2020));
        System.out.println(nextDayCalculator(29,1,2019));
        System.out.println(nextDayCalculator(15,1,2019));
        System.out.println(nextDayCalculator(31,3,2019));
        System.out.println(test());

    }
}
