package com.Assignment4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/25.
 */
public class NonStudentServiceImplTest {

    private LoanInterface loan;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        loan = (LoanInterface)ctx.getBean("loanNonStud");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void calculateInterest() throws Exception {

        double interestAmount = loan.calculateInterest(2,1);

        assertEquals(0.4,interestAmount,0);
    }

}