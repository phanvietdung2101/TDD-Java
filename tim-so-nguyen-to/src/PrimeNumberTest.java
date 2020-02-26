import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeNumberTest {
    @Test
    void test1() {
        int expect = 97;
        int result = PrimeNumber.showPrimeNumberByPosition(25);
        assertEquals(expect, result);
    }

}