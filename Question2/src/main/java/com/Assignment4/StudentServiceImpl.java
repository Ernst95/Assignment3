package com.Assignment4;

/**
 * Created by Ernst on 2017/03/25.
 */
public class StudentServiceImpl implements LoanInterface {

    public StudentServiceImpl()
    {

    }

    public double calculateInterest(double principalAmount, int years)
    {
        return ((principalAmount * 0.1) * years);
    }

}
