import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WaterBottleTest {

    WaterBottle myWaterBottle;
    @Before
    public void before() {
        myWaterBottle = new WaterBottle(100);
    }

    @Test
    public void VolumeIs100(){
        assertEquals(100, myWaterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        myWaterBottle.drink();
        assertEquals(90, myWaterBottle.getVolume());
    }
    @Test
    public void canEmptyBottle() {
        myWaterBottle.empty();
        assertEquals(0, myWaterBottle.getVolume());
    }

    @Test
    public void canFillBottle() {
        myWaterBottle.empty();
        myWaterBottle.fill();
        assertEquals(100, myWaterBottle.getVolume());
    }
}
