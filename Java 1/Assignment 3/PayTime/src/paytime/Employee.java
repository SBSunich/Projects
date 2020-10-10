/**
 * Name: Sunil Sunichura
 * Student Number: 991578383
 * Assignment 3
 * Date: November 23, 2019
 */
package paytime;

import java.util.Arrays;

public class Employee {

    private int empNumbers[] = {101, 103, 106, 109, 110, 113, 116, 118, 120};
    private double hoursWorked;
    private double hourlyRate;
    private double regularPay;
    private double incomeTaxRate;
    private double incomeTax;
    private double overtimeHoursWorked;
    private double overtimeHourlyRate;
    private double overtimePay;
    private double overtimeTaxRate;
    private double overtimeTax;

    public boolean findEmpNum(int empNum) {
        Arrays.sort(empNumbers);
        int position = Arrays.binarySearch(empNumbers, empNum);
        return position >= 0;
    }

    private void calculatePay(double hoursWorked, double hourlyRate) {
        if (this.hoursWorked <= 40) {
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
            regularPay = hoursWorked * hourlyRate;
        } 
        else {
            regularPay = 40 * hourlyRate;
        }
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getPay() {
        calculatePay(hoursWorked, hourlyRate);
        return regularPay;
    }

    private void incomeTax() {
        if (regularPay <= 300.00) {
            incomeTaxRate = 0.10;
        } 
        else if (regularPay <= 400.00) {
            incomeTaxRate = 0.12;
        } 
        else if (regularPay <= 500.00) {
            incomeTaxRate = 0.15;
        } 
        else {
            incomeTaxRate = 0.20;
        }
        incomeTax = incomeTaxRate * regularPay;
    }

    public double getIncomeTax() {
        incomeTax();
        return incomeTax;
    }

    public double getNetPay() {
        return regularPay - incomeTax;
    }

    private void calculateOvertimePay(double hoursWorked, double hourlyRate) {
        if (hoursWorked > 40) {
            overtimeHoursWorked = hoursWorked - 40;
            overtimeHourlyRate = hourlyRate * 1.5;
            overtimePay = overtimeHoursWorked * overtimeHourlyRate;
        }
    }

    public double getOvertimePay() {
        calculateOvertimePay(hoursWorked, hourlyRate);
        return overtimePay;
    }

    private void calculateOvertimeTaxes() {
        if (overtimePay > 0) {
            overtimeTaxRate = 0.25;
            overtimeTax = overtimePay * overtimeTaxRate;
        }
    }

    public double getOvertimeTaxes() {
        calculateOvertimeTaxes();
        return overtimeTax;
    }

    public double getOvertimeNetPay() {
        return overtimePay - overtimeTax;
    }

    public double getTotalNetPay() {
        return (regularPay - incomeTax)
                + (overtimePay - overtimeTax);
    }
}
