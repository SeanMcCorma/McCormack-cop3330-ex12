package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the pricipal: ");
        double principal = Double.parseDouble(scan.nextLine());
        System.out.print("Enter the rate of interest: ");
        double interest = Double.parseDouble(scan.nextLine());
        System.out.print("Enter the number of years: ");
        int years = Integer.parseInt(scan.nextLine());
        double interest_cal = interest/100;
        double investment = Math.ceil(principal*(1+years*interest_cal)*100)/100;
        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f",years,interest,investment);
    }
}
