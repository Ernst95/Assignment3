package com.Assignment4;

/**
 * Created by Ernst on 2017/03/25.
 */
public class CalculatorServiceImpl implements CalculatorInterface{

    public int add(int a, int b)
    {
        return (a+b);
    }

    public int subtract(int a, int b)
    {
        return (a-b);
    }

    public int divide(int a, int b)
    {
        return (a/b);
    }

    public int multiply(int a, int b)
    {
        return (a*b);
    }
}
