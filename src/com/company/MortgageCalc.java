package com.company;

import java.util.Scanner;

public class MortgageCalc {

    void findMortgage(){
        Scanner scanner = new Scanner(System.in);

        double principal = 0;
        int month_in_years = 12;
        int percent = 100;
        double interestRates = 0;
        double interestRatesConversion;
        double periodInYears = 0;
        double periodInYearsConversion = 0;

        while(true){
            System.out.print("Principal: ");
            principal = scanner.nextDouble();

            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            } else {
                System.out.println("Invalid number. Please enter a number between 1k and 1 million");
            }
        }

        while (true){
            System.out.print("Interest Rate: ");
            interestRates = scanner.nextDouble();
            if(interestRates >= 1 && interestRates <= 30){
                break;
            }
            System.out.println("Invalid number. Please enter a number between 1 and 30");

        }

        while (true){
            System.out.print("Period (Years): ");
            periodInYears = scanner.nextDouble();
            periodInYearsConversion = periodInYears * month_in_years;
            if (periodInYears <= 30 && periodInYears >= 1){
                break;
            }
            System.out.println("Invalid number. Please enter a number between 1 and 30");
        }

        interestRatesConversion = (interestRates / percent) / month_in_years;
        double num1 = Math.pow(1 + interestRatesConversion, periodInYearsConversion) * interestRatesConversion;
        double num2 = Math.pow(1 + interestRatesConversion, periodInYearsConversion) - 1;
        double mortgage = principal * (num1 / num2);

        System.out.println("Mortgage: " + mortgage);


    }
}
