package com.bridgelabz;

import java.util.Scanner;

public class AutomorphicNumber {
//	 static void checkForAutomorphic(int number)
//	    {
//	        int square = number*number;
//	        while(number != 0)
//	        {
//	            if (number % 10 != square % 10) {
//	                System.out.println("The number is not an Automorpic number");
//	                return;
//	            }
//	            number = number/10;
//	            square = square/10;
//	        }
//	        System.out.println("The number is an Automorpic number");
//	    }
//	 
	 
	 
	 public static void main (String[] args)
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a Number: ");
//	        int number = input.nextInt();
//	        checkForAutomorphic(number);
	 
		 int num = input.nextInt();
	     int sq_num = num*num;  
	
	     String str_num = Integer.toString(num);  
	     String square = Integer.toString(sq_num);  
	
	     if(square.endsWith(str_num))  
	         System.out.println("Automorphic Number.");
	     else
	         System.out.println("Not an Automorphic Number.");
 }
}