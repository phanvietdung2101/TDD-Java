package APJCaculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class NextDayCalculatorTest {
    @Test
    void test1(){
        int day = 1;
        int month = 2;
        int year = 2020;

        String expect = "2-2-2020";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

    @Test
    void test2(){
        int day = 31;
        int month = 1;
        int year = 2020;

        String expect = "1-2-2020";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

    @Test
    void test3(){
        int day = 32;
        int month = 1;
        int year = 2020;

        String expect = "Invalid input";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

    @Test
    void test4(){
        int day = 28;
        int month = 2;
        int year = 2020;

        String expect = "29-2-2020";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

    @Test
    void test5(){
        int day = 31;
        int month = 12;
        int year = 2020;

        String expect = "1-1-2021";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

    @Test
    void test6(){
        int day = 28 ;
        int month = 2;
        int year = 2019;

        String expect = "1-3-2019";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

}