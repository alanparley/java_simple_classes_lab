import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PrinterTest {

    Printer myPrinter;
    @Before
    public void before(){
        myPrinter = new Printer(500, 100);
    }

    @Test
    public void hasSheets() {
        assertEquals(500, myPrinter.getSheets());
    }

    @Test
    public void enoughPaperToPrint() {
        assertTrue(myPrinter.canPrint());
    }
    @Test
    public void hasToner() {
        assertEquals(100, myPrinter.getToner());
    }

    @Test
    public void reduceToner() {
        myPrinter.toner -= myPrinter.print(10, 2);
        assertEquals(80, myPrinter.getToner());
    }
}
