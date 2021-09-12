/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "Enter the first number: " );
        int num1 = scnN.nextInt();
        System.out.print( "Enter the second number: " );
        int num2 = scnN.nextInt();
        System.out.print( "Enter the third number: " );
        int num3 = scnN.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.print( "The largest number is "+ num1 +"." );
        }
        if(num2 > num1 && num2 > num3){
            System.out.print( "The largest number is "+ num2 +"." );
        }
        if(num3 > num2 && num3 > num1){
            System.out.print( "The largest number is "+ num3 +"." );
        }
    }
}
