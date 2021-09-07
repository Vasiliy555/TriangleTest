package geekbrains;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleTest {
    static final Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    public static int count;


    @BeforeAll
    static void setUpTest() {
        logger.info("Start our tests");
    }

    @BeforeEach
    void UpTest() {
        count++;
        logger.info(count + " - test start");
    }

    @AfterEach
    void tearDownTest() {
        logger.info(count + " - test end");

    }

    @AfterAll
    static void downTest() {
        logger.info("End our tests");
    }

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5",
            "-5, 4, 5",
            "5, 40, 5",
            "5, 4, 0",
            "5, 5, 5",
            "29,41,14"
    })
    void areaTest(double x, double y, double z) {
        double u = Triangle.triangleArea(x, y, z);
        double v = (x + y + z) / 2;
        assertEquals(Math.sqrt(v * (v - x) * (v - y) * (v - z)), u);
    }


    @Test
    void determineTypeTest() {
        Assertions.assertAll(
                () -> assertEquals(TriangleType.EQUILATERAL.getType(), Triangle.determineType(2, 2, 2)),
                () -> assertEquals(TriangleType.ISOSCELES.getType(), Triangle.determineType(2, 2, 3)),
                () -> assertEquals(TriangleType.SCALENE.getType(), Triangle.determineType(4, 5, 6)),
                () -> assertEquals(TriangleType.INVALID.getType(), Triangle.determineType(0, 10, 10)),
                () -> assertEquals(TriangleType.RIGHT.getType(), Triangle.determineType(4, 3, 5))

        );
    }
}
