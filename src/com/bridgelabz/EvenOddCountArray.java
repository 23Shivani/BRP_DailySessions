package com.bridgelabz;

import java.util.Scanner;

public class EvenOddCountArray {

	public static void main(String[] args) {
		  int even=0,odd=0;
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.print("Enter the array size :\n");
		  int size=scan.nextInt();
		  System.out.print("Enter the elements of the array :\n");
		  int arr[]=new int[size];
		  int i=0;
		  do{
		     System.out.printf("Enter the element arr[%d]:",i);
		          arr[i]=scan.nextInt();
		           i++;
		      }while( i<arr.length);
		      
		      i=0; 
		      do{
		          if(arr[i]%2==0){
		              even++;
		       
		          }
		          else{
		              odd++;
		      }
		       i++;
		  }while(i<size);
		  System.out.println("Total even numbers of an array: "+even);
		  System.out.println("Total odd numbers of an array: "+odd);
	}
}