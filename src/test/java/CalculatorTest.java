import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(calculator.add(2, 2), 4);
    }

    @Test
    public void testSub() {
        assertEquals(calculator.sub(6, 2), 4);
    }

    @Test
    public void testMul() {
        assertEquals(calculator.mul(2, 2), 4);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDiv() {
        assertEquals(calculator.div(2, 0), 1);
    }

    @AfterMethod
    public void tearDown() {
        calculator = null;
    }
}