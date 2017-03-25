package com.Assignment4;

import junit.framework.TestCase;
import org.junit.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/25.
 */
public class StudentServiceImplTest {

    private LoanInterface loan;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        loan = (LoanInterface)ctx.getBean("loan");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculateInterest() throws Exception {

        double interestAmount = loan.calculateInterest(4,1);

        assertEquals(0.8,interestAmount,0);
    }

}