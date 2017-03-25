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
        int choice;

        StudentServiceImpl stud = new StudentServiceImpl();
        NonStudentServiceImpl nonStud = new NonStudentServiceImpl();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("*****Loan Calculator*****");
            System.out.println("\t1. Student");
            System.out.println("\t2. Non Student");
            System.out.println("\t3. Exit");
            System.out.print("Choose option: ");
            choice = input.nextInt();

            while (choice != 1 && choice != 2 && choice != 3) {
                System.out.print("Invalid choice, please re-enter: ");
                choice = input.nextInt();
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter loan amount:R ");
                    principalAmount = input.nextDouble();

                    System.out.print("Enter number of years: ");
                    years = input.nextInt();

                    interestAmount = stud.calculateInterest(principalAmount, years);

                    System.out.println("Principal amount:R " + principalAmount + "\tYears: " + years + "\tInterest amount:R " + interestAmount + "\tTotal amount:R " + (principalAmount + interestAmount)+ "\n");
                    System.out.println("Press enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;
                case 2:
                    System.out.print("Enter loan amount:R ");
                    principalAmount = input.nextDouble();

                    System.out.print("Enter number of years: ");
                    years = input.nextInt();

                    interestAmount = nonStud.calculateInterest(principalAmount, years);

                    System.out.println("Principal amount:R " + principalAmount + "\tYears: " + years + "\tInterest amount:R " + interestAmount + "\tTotal amount:R " + (principalAmount + interestAmount) + "\n");
                    System.out.println("Press enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Error...");
            }

        } while (choice != 3);
    }
}
