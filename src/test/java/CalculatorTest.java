import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void add_5_plus_5_equals_10(){
        assertEquals(10, Calculator.add(5, 5));
    }

    @Test
    public void subtract_5_from_10_equals_5(){
        assertEquals(5, Calculator.subtract(10, 5));
    }

    @Test
    public void multiply_5_by_5_equals_25(){
        assertEquals(25, Calculator.multiply(5, 5));
    }

    @Test
    public void divide_10_by_2_equals_5(){
        assertEquals(5.00, Calculator.divide(10.00, 2.00), 0.01);
    }

}
