package com.bridgelabz;

import java.util.Scanner;

public class Factorial {
	
//Without Recursion
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("num:");
	int num = scan.nextInt();
	
	int fact = 1 ;
	for (int i=2; i<=num; i++) 
	{
		fact = fact*i;
	}
	System.out.println("Factorial : "+fact);
	scan.close();
}

}
	
	
// Recursive
//	public static void main(String[] args) {
//	    int num = 8;
//	    long factorial = factorialNum(num);
//	    System.out.println("Factorial of " + num + " = " + factorial);
//	}
//	
//	public static long factorialNum(int num)
//	{
//	    if (num >= 1)
//	        return num * factorialNum(num - 1);
//	    else
//	        return 1;
//	}