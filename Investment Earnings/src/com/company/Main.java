package com.company;

import java.util.Scanner;
import java.text.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per share:");
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice;
        DecimalFormat df = new DecimalFormat("0.00");
        while(true){
            System.out.println("Enter the closing price for day " + day + " (any negative value to leave: ");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) break;
            double earnings = closingPrice - buyingPrice;
            if(earnings > 0) {
                System.out.println("After day " + day + ", you earned " + df.format(earnings) + " per share.");
            }
            else if(earnings < 0.0){
                System.out.println("After day " + day + ", you lost " + df.format(-earnings) + " per share.");
            }
            else {
                System.out.println("After day " + day + ", you have " + "no earnings per share.");
            }
            day += 1;
        }
        scan.close();
    }
}
