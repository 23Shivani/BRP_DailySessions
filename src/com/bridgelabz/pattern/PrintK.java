package com.bridgelabz.pattern;

public class PrintK {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)//row
		{
			for(j=1;j<5;j++)//col
			{
				if(j ==1 ||(j==2 && i==3 )||(j==3 &&i==2)||(j==4 && i==1)||(j==3 && i==4)||(j==4 && i==5))
					System.out.print("**");
				else
					System.out.print("  ");
			}
			System.out.println();
		

	}
}
}