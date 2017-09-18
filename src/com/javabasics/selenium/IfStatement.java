package com.javabasics.selenium;

import java.util.Scanner;

/**
 * Created by gaurnitai on 2017-08-31.
 */
public class IfStatement {

    public static void main(String args[]) {
        double score = 80.0;
        if (score >= 60.0) System.out.println("D");
        else if (score >= 70.0) System.out.println("C");
        else if (score >= 80.0) System.out.println("B");
        else if (score >= 90.0) System.out.println("A");
        else
            System.out.println("F");


        double x = 1.0 - 0.1-0.1-0.1;
        System.out.println(x);
        System.out.println(Math.abs(x));
        final double EPSILON = 1E-14;
        if( (x - 0.7) < EPSILON) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner();
    }

    public static void scanner() {

        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in); // Alt + enter to import

        System.out.print("Please enter your age >> ");
        age = inputDevice.nextInt();
        inputDevice.nextLine(); // why we have written this ?
        // Actually if we dont write this we will not get

        System.out.print("Please enter your name >> ");
        name = inputDevice.nextLine();
        System.out.println("Your name is " + name +
                " and you are " + age + " years old.");

        int box = Integer.valueOf(123);

    }

}
