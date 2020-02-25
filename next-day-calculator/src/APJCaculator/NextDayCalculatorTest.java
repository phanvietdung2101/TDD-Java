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

        String expect = "1-2-2020";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

    @Test
    void test4(){
        int day = 27;
        int month = 2;
        int year = 2020;

        String expect = "28-2-2020";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

}