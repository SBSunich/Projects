/**
 * Name: Sunil Sunichura
 * Student Number: 991578383
 * Assignment 3
 * Date: November 23, 2019
 */
package paytime;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        DecimalFormat dollar = new DecimalFormat("$#,##0.00");
        Employee one = new Employee();

        System.out.print("Enter Y to process a worker or any other key to "
                + "end: ");
        String keyword = k.nextLine();
        int total = 0;

        while ("Y".equals(keyword)) {
            total++;
            System.out.print("Enter employee number: ");
            int empNum = k.nextInt();
            while (!one.findEmpNum(empNum)) {
                System.out.print("Invalid, enter proper employee number: ");
                empNum = k.nextInt();
            }
            
            k.nextLine();
            
            System.out.print("\tEnter first name: ");
            String empFirst = k.nextLine();
            System.out.print("\tEnter last name: ");
            String empLast = k.nextLine();
            System.out.print("\tEnter hours worked: ");
            double hoursWorked = k.nextDouble();
            while (hoursWorked < 0) {
                System.out.println("Negative hours not allowed");
                System.out.print("Enter hours worked: ");
                hoursWorked = k.nextDouble();
            }
            System.out.print("\tEnter hourly wage: ");
            double hourlyWage = k.nextDouble();
            while (hourlyWage < 0) {
                System.out.println("Negative hourly wage not allowed");
                System.out.print("Enter hourly wage: ");
                hourlyWage = k.nextDouble();
            }
            one.setHoursWorked(hoursWorked);
            one.setHourlyRate(hourlyWage);
            System.out.println();

            System.out.println("Worker " + empNum + " Paycheck Information");
            System.out.println("\tName is: " + empFirst + " " + empLast);
            System.out.println("\tWeekly Pay is: " + 
                    dollar.format(one.getPay()));
            System.out.println("\tIncome Taxes is: " + 
                    dollar.format(one.getIncomeTax()));
            System.out.println("\tNet Pay is: " + 
                    dollar.format(one.getNetPay()));

            System.out.println();

            if (hoursWorked > 40) {

                System.out.println("Worker " + empNum + " Overtime "
                        + "Calculation: ");
                System.out.println("\tOvertime Pay is: " + 
                        dollar.format(one.getOvertimePay()));
                System.out.println("\tOvertime Tax is: " + 
                        dollar.format(one.getOvertimeTaxes()));
                System.out.println("\tOvertime Net Pay: " + 
                        dollar.format(one.getOvertimeNetPay()));
                System.out.println("\tTotal Net Pay is: " + 
                        dollar.format(one.getTotalNetPay()));
            }
            
            k.nextLine();
            
            System.out.print("Enter Y to process another worker or any other"
                    + " key to end: ");
            keyword = k.nextLine();
        }
        System.out.println();
        System.out.println("Total number of Employees processed: " + total);
    }
}
