import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassifyingTrianglesTest {
    static int[][] inputTest =  new int[][]{
            {2, 2, 2},
            {2, 2, 3},
            {3, 4, 5},
            {8, 2, 3},
            {-1, 2, 1},
            {0,1,1}
    };
    static String[] expect = new String[]{
            "Tam giac deu",
            "Tam giac can",
            "Tam giac thuong",
            "Khong phai la tam giac",
            "Khong phai la tam giac",
            "Khong phai la tam giac"
    };

    @Test
    void test() {
        for (int i = 0; i < expect.length; i++) {
            String result = TrianglesClassifier.classifyTriangles(inputTest[i][0], inputTest[i][1], inputTest[i][2]);
            assertEquals(expect[i], result);
        }
    }

}