package test_calc;

import org.testng.Assert;
import org.testng.annotations.Test;
import calculator.Calculator;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        int result = calc.add(2,3);
        Assert.assertEquals(result,5);
    }

    @Test
    public void testSubtraction() {
        int result = calc.subtract(5,3);
        Assert.assertEquals(result,2);
    }

    @Test
    public void testMultiplication() {
        int result = calc.multiply(4,3);
        Assert.assertEquals(result,12);
    }

}