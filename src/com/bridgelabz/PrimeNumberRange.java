package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
			System.out.print("Enter Starting Number : ");
			int firstNum = sc.nextInt();
			System.out.print("Enter Ending Number : ");
			int lastNum = sc.nextInt();
			System.out.println("Prime numbers between "+firstNum+" and "+lastNum+" are : ");
			int count;
			
			for(int i = firstNum ; i <= lastNum ; i++)
			{

				count = 0;
				for(int j = 1 ; j <= i ; j++)	
				{
					if(i % j == 0)
						count = count+1;
				}
				if(count == 2)
					System.out.println(i);
			}
		sc.close();
	}
}