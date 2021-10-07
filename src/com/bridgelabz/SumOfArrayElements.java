package com.bridgelabz;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args){
		int Size, i = 0, j = 0, Sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements in an array : ");
		
		Size = sc.nextInt();	
		int [] a = new int[Size];
		System.out.print("Enter " + Size + " elements of an Array  : ");
		
		while(i < Size)
		{
			a[i] = sc.nextInt();
			i++;
		}   
		while(j < Size)
		{
			Sum = Sum + a[j];
			j++;
		}		
		System.out.println("\n Sum of all the Elements= " + Sum);
	}

}