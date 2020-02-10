import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {


    private WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }


    @Test
    public void waterbottle_has_a_volume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void reduce_volume_by_drinking_from_bottle(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void empty_bottles_volume(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fill_volume_to_full_in_bottle(){
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }

}
