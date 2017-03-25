package com.Assignment4;

import java.util.Scanner;

/**
 * Created by Ernst on 2017/03/25.
 */
public class runLoan {

    public static void main(String[]args) {
        double principalAmount;
        int years;
        double interestAmount;

        StudentServiceImpl cal = new StudentServiceImpl();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount:R ");
        principalAmount = input.nextDouble();

        System.out.print("Enter number of years: ");
        years = input.nextInt();

        interestAmount = cal.calculateInterest(principalAmount, years);

        System.out.println("Principal amount:R " + principalAmount + "\tYears: " + years + "\tInterest amount:R " + interestAmount + "\tTotal amount:R " + (principalAmount + interestAmount));
    }
}
