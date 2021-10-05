package com.bridgelabz;

public class Sorting {

	public static void main(String[] args) {
		
		//string sort
		 String str = "qwertyuiop";
	     System.out.println("Before Sorting:" + str);
	     
	      int j = 0;
	      char temp = 0;
	      char[] chars = str.toCharArray();
	      for(int i=0; i < chars.length; i++) {
	         for(j=0; j < chars.length; j++) {
	            if(chars[j] > chars[i]) {
	               temp = chars[i];
	               chars[i] = chars[j];
	               chars[j] = temp;
	            }
	         }
	      }
	      
	     System.out.println("After Sorting:");
	      for(int k=0; k < chars.length; k++) {
	         System.out.println(chars[k]);
	      }
	      
	    //numeric sort      
		int temp1=0;
		int[] arrNumbers = {25, 75, 12, 60, 18, 9, 67, 34};
		System.out.println("Before sort: ");
		for(int num : arrNumbers)
		{
		   System.out.print(num);
		}
		for(int a = 0; a <= arrNumbers.length - 1; a++)
		{
		   for(int b = 0; b <= arrNumbers.length - 2; b++)
		   {
		      if(arrNumbers[b] < arrNumbers[b + 1])
		      {
		         temp1 = arrNumbers[b];
		         arrNumbers[b] = arrNumbers[b + 1];
		         arrNumbers[b + 1] = temp1;
		      }
		   }
		}
		System.out.println("After sort: ");
		    for(int num : arrNumbers)  
		    {
		       System.out.println(num);
		  }
		 }
}
