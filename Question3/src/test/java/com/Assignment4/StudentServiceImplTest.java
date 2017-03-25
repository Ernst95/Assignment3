package com.Assignment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/25.
 */
public class StudentServiceImplTest {

    LoanInterface loan;

    @Before
    public void setUp() throws Exception {
        System.out.println("In Before Class");
    }

    @Test
    public void calculateInterest() throws Exception {

        loan = new StudentServiceImpl();
        double principalAmount = 10;
        int years = 2;
        double interestAmount = loan.calculateInterest(principalAmount,years);

        assertEquals(2.0,interestAmount,0);
    }

}