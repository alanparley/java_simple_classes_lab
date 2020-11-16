import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {

    Calculator testCalculator;

    @Before
    public void before () {
        testCalculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4, testCalculator.add(2, 2));
    }

    @Test
    public void canSubtract() {
        assertEquals(2, testCalculator.subtract(4, 2));
    }

    @Test
    public void canMultiply() {
        assertEquals(15, testCalculator.multiply(5, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(2.5, testCalculator.divide(5.00, 2.00), 0.00);
    }
}
