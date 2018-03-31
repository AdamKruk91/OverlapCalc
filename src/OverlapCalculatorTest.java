import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverlapCalculatorTest {

    OverlapCalculator overlapCalculator;

    @Test
    public void checkIfNotOverlapingTest(){
        long expectedResult = 0;
        overlapCalculator = new OverlapCalculator(-12, -4, -1, -2, 0, 0, 100, 3000);
        assertEquals(expectedResult, overlapCalculator.calculateOverlap());
    }

    @Test
    public void checkGoodResultTest(){
        long expectedResult = 110;
        overlapCalculator = new OverlapCalculator(-1,-1,10,10,0,-1,10,10);
        assertEquals(expectedResult, overlapCalculator.calculateOverlap());
    }

    @Test
    public void checkWithBigNumbersTest(){
        long expectedResult = 1000000000000L;
        overlapCalculator = new OverlapCalculator(0, 0,  1000000, 1000000, 0, 0, 1000000, 1000000);
        assertEquals(expectedResult, overlapCalculator.calculateOverlap());
    }

    @Test
    public void checkWithMinusNumsTest(){
        long expectedResult = 16;
        overlapCalculator = new OverlapCalculator(-4, -4,  0, 0, -4, -4, 0, 0);
        assertEquals(expectedResult, overlapCalculator.calculateOverlap());
    }

    @Test
    public void checkWithHalfMinusNumsTest(){
        long expectedResult = 16;
        overlapCalculator = new OverlapCalculator(-4, 0,  0, 4, -4, 0, 0, 4);
        assertEquals(expectedResult, overlapCalculator.calculateOverlap());
    }

    @Test
    public void checkWithBiggerBottomsThanTopTest(){
        long expectedResult = 0;
        overlapCalculator = new OverlapCalculator(4, 4,  0, 0, 4, 4, 0, 0);
        assertEquals(expectedResult, overlapCalculator.calculateOverlap());
    }
}