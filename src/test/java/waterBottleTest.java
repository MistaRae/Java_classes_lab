import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class waterBottleTest {

    waterBottle WaterBottle;
    waterBottle newWaterBottle;
    @Before
    public void before () {
        WaterBottle = new waterBottle(100);
        newWaterBottle = new waterBottle(10);
    }

    @Test
    public void canDrink(){
        assertEquals(90, WaterBottle.drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, WaterBottle.empty());
    }

    @Test
    public void canFill(){
        assertEquals(100, newWaterBottle.fill());
    }
}
