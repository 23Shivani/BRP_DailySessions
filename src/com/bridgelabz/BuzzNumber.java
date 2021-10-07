package com.bridgelabz;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any number: ");
        int n = scan.nextInt();

        if (n % 10 == 7 || n % 7 == 0) {
            System.out.println("Buzz number!");
        }
        else {
            System.out.println("Not a Buzz number!");
        }
    }

}