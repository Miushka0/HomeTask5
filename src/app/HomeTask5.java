package app;

import java.util.Scanner;

public class HomeTask5 {
    static double  taxCalculation;

    public static void main (String[] args) {
        System.out.println("Please, enter your income for tax calculation:");
        Scanner incomeValue = new Scanner(System.in);
        double number = incomeValue.nextDouble ();
//        int number = incomeValue.nextInt();
        if (number < 0) {
            System.out.println("Please enter positive number");
            return;
        }

        if (number <= 10000) {
            taxCalculation = number * 0.025;
        } else if (number <= 25000) {
            taxCalculation = number * 0.043;
        } else {
            taxCalculation = number * 0.067;
        }

        System.out.printf("Your tax is: %.2f",
                taxCalculation);
    }
}


