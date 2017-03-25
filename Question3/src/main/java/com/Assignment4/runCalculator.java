package com.Assignment4;

import java.util.Scanner;

/**
 * Created by Ernst on 2017/03/25.
 */
public class runCalculator {

    public static void main(String[]args)
    {
        int choice;
        int num1;
        int num2;
        int answer = 0;

        CalculatorServiceImpl cal = new CalculatorServiceImpl();
        Scanner input = new Scanner(System.in);

        do{

            System.out.println("\t1. Addition");
            System.out.println("\t2. Subtraction");
            System.out.println("\t3. Division");
            System.out.println("\t4. Multiplication");
            System.out.println("\t5. Exit");
            System.out.println("Please choose an option: ");

            choice = input.nextInt();

            while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5)
            {
                System.out.println("\t1. Addition");
                System.out.println("\t2. Subtraction");
                System.out.println("\t3. Division");
                System.out.println("\t4. Multiplication");
                System.out.println("\t5. Exit");
                System.out.println("Invalid option, please re-enter option: ");
                choice = input.nextInt();
            }

            switch (choice)
            {
                case 1: System.out.println("Please enter number 1: ");
                        num1 = input.nextInt();
                        System.out.println("Please enter number 2: ");
                        num2 = input.nextInt();
                        answer = cal.add(num1,num2);
                        System.out.println("Answer: " + answer);
                        break;
                case 2: System.out.println("Please enter number 1: ");
                        num1 = input.nextInt();
                        System.out.println("Please enter number 2: ");
                        num2 = input.nextInt();
                        answer = cal.subtract(num1,num2);
                        System.out.println("Answer: " + answer);
                        break;
                case 3: System.out.println("Please enter number 1: ");
                        num1 = input.nextInt();
                        System.out.println("Please enter number 2: ");
                        num2 = input.nextInt();
                        while(num2 == 0)
                        {
                            System.out.println("Cannot divide by Zero, please re-enter number 2: ");
                            num2 = input.nextInt();
                        }
                        answer = (cal.divide(num1,num2));
                        System.out.println("Answer: " + answer);
                        break;
                case 4: System.out.println("Please enter number 1: ");
                        num1 = input.nextInt();
                        System.out.println("Please enter number 2: ");
                        num2 = input.nextInt();
                        answer = cal.multiply(num1,num2);
                        System.out.println("Answer: " + answer);
                        break;
                case 5: System.out.println("Exiting...");
                        break;
                default:System.out.println("Error...");
            }

        }while(choice != 5);
    }
}
