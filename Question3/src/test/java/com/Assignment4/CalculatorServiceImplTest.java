package com.Assignment4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ernst on 2017/03/25.
 */
public class CalculatorServiceImplTest {

    CalculatorInterface cal;

    @Before
    public void setUp() throws Exception {
        System.out.println("In Before Class");
    }

    @Test
    public void add() throws Exception
    {
        cal = new CalculatorServiceImpl();
        int result = cal.add(4,2);
        assertEquals("Addition: 4 + 2",6,result);
    }

    @Test
    public void subtract() throws Exception
    {
        cal = new CalculatorServiceImpl();
        int result = cal.subtract(4,2);
        assertEquals("Subtraction: 4 - 2",2,result );
    }

    @Test
    public void divide() throws Exception
    {
        cal = new CalculatorServiceImpl();
        int result = cal.divide(4,2);
        assertEquals("Division: 4 / 2", 2, result);
    }

    @Test
    public void multiply() throws Exception
    {
        cal = new CalculatorServiceImpl();
        int result = cal.multiply(4,2);
        assertEquals("Multiplication: 4 * 2", 8 ,result);
    }
}