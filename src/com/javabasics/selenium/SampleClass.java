package com.javabasics.selenium;

/**
 * Created by gaurnitai on 2017-08-24.
 */
public class SampleClass {

    public static void main(String args[]){

        String s = "Hare Krishna";
        System.out.println(s);
        StringBuffer sb = new StringBuffer(s);
        sb.append(" Prabhuji");
        System.out.println(sb);
        sb.replace(2,4,"Rama");
        System.out.println(sb);


    }
}
