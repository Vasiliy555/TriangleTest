package geekbrains;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



public class TriangleTest {
    static final Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    public static int count;


    @BeforeAll
    static void setUpTest(){
        logger.info("Start out tests");
    }



    @AfterEach
    void tearDownTest(){
        count++;

        logger.info(count + " - test passed");


    }

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
            "5, 4, 5",
            "3, 4, 5",
            "5, 5, 5",
            "29,41,14"
    })
     void determineTypeTest(int a, int b, int c) {
        Triangle.determineType(a, b, c);
        System.out.println(Triangle.determineType(a, b, c));

    }

}
