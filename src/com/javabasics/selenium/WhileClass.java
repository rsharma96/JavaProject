package com.javabasics.selenium;

import java.util.Scanner;

/**
 * Created by gaurnitai on 2017-09-01.
 */
public class WhileClass {


    /*Consider we have one number system game where we have to select a
    number within a particular range. As long as we do not select number
    within that expected range the game keeps asking for desired number to enter.
     */

    public void selectNumber() {

        int enteredValue = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid number > ");
        enteredValue = sc.nextInt();

        while (enteredValue > 6) {

            System.out.println("You have entered out of range value ");
            System.out.println("Try once again > ");
            enteredValue = sc.nextInt();
        }
        System.out.println("Great job ! you have entered value within range ");
        System.out.println(" Wanna try once more ");
        //selectNumber();

        // if we want to give flexibility to user for quiting any time

        String enter = sc.nextLine();
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("y")) {
            selectNumber();
        } else {
            System.out.println("Hope you enjoyed the game");
        }
    }

    public static void main(String args[]) {

        WhileClass wc = new WhileClass();
        wc.selectNumber();
    }


}
