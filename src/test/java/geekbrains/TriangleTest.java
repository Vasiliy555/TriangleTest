package geekbrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest {

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5",
            "29,41,14"
    })
    void areaTest(double x, double y, double z){
        double u = Triangle.triangleArea(x, y, z);
        double v = (x + y + z)/2;
        Assertions.assertEquals(Math.sqrt(v*(v-x)*(v-y)*(v-z)), u);


    }
    @ParameterizedTest
    @CsvSource({
            "0, 4, 5",
            "1, 4, 50",
            "3, 4, 5",
            "5, 5, 5",
            "29,41,14"
    })
     void determineTypeTest(int a, int b, int c) {
        System.out.println(Triangle.determineType(a, b, c));

    }

}
