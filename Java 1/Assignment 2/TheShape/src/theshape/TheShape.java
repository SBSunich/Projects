/**
 * Name: Sunil Sunichura 
 * Student ID: 991578383 
 * Assignment 2 
 * Date: 2019-09-28
 */

/*
 * This program completes calculations for the user based on the inputs 
 * provided. First the user has a choose between 1,2,3 for the shape.
 * Then the user has to provide numbers for the parameters.
 * Then finally, the program will provide information about the shape
 * constructed.
 */
package theshape;

import java.util.Scanner;

public class TheShape {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in); // Scanner that reads user input
        /* 
         1 is for Triangle calculation
         2 is for Rectangle calculation
         3 is for Circle calculation
         */
        System.out.print("1 for a Triangle calculation "
                + "\n2 for a Rectangle calculation"
                + "\n3 for a Circle calculation"
                + "\nEnter a selection from 1 to 3: ");
        int num = k.nextInt();

        if (num < 1 || num > 3) {   // no var num less than 1/var num > 3
            System.out.println("Invalid number, must be from 1 to 3");
        }
        /*If the corresponding number is selected (1 to 3), the program will
        execute that part of the program and ask for user input for 
        calculation purposes. It will also check to ensure no negative 
        numbers are inputted.
        */
        else {
            if (num == 1) {
                System.out.print("Enter a number for height: ");
                double x = k.nextDouble();
                double height = x >= 0 ? x : -1; // conditional operator
                if (height < 0) {
                    System.out.println("Height cannot be a negative number");
                } else {
                    System.out.print("Enter a number for base: ");
                    double base = k.nextDouble();
                    if (base < 0) {
                        System.out.println("Base cannot be a negative number");
                    } else {
                        double triArea = 0.5 * height * base;
                        System.out.println("The area of the Triangle is: "
                                + triArea);
                    }
                }
            } 
            else if (num == 2) {
                System.out.print("Enter a number for width: ");
                double width = k.nextDouble();
                if (width < 0) {
                    System.out.println("Width cannot be a negative number");
                } else {
                    System.out.print("Enter a number for length: ");
                    double length = k.nextDouble();
                    if (length < 0) {
                        System.out.println("Length cannot be a negative "
                                + "number");
                    } else {
                        double recArea = length * width;
                        double perimeter = 2 * (length + width);
                        System.out.println("The area of the rectangle is: "
                                + recArea + " and the perimeter is: " 
                                + perimeter);
                    }
                }
            }
            else {
                System.out.print("Enter a number for radius: ");
                double radius = k.nextDouble();
                if (radius < 0) {
                    System.out.println("Radius cannot be a negative number");
                } else {
                    double diameter = 2 * radius;
                    System.out.println("The diameter of the circle is: "
                            + diameter);
                }
            }
        }
        System.out.println("Name: Sunil Sunichura "
                + "\nStudent ID: 991578383");
    }

}
