/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Ratchford
 */
import java.util.Scanner;

public class Interest {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // here we are going to use the formula for si,ple interest

        double  Amount;
        // This is the principle amount
        double P;
        // This is where we call our rate
        double r;
        // This is where we call the number of years
        int t;

        System.out.print(" Enter the principal:\n ");
        P = scan.nextInt();

        System.out.print(" Enter the rate of interest:\n ");
        r = scan.nextInt();

        System.out.print(" Enter the number of years:\n ");
        t = scan.nextInt();
        // solve fo total amount
        
        Amount = P * (1 + r * t);

        System.out.println(" After at " + t + " years " + r + " %, the investment will be worth $" + Amount + " . ");
;









    }
}
