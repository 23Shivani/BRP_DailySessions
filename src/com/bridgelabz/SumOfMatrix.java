package com.bridgelabz;

import java.util.Scanner;

public class SumOfMatrix {

	public static void main(String[] args) {
		
		int row, col,i,j;
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter the number of rows");
		row = input.nextInt();
		 
		System.out.println("Enter the number columns");
		col = input.nextInt();
		 
		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int result[][] = new int[row][col];
		
		System.out.println("Enter the elements of matrix1:");
		i=0;
		while ( i < row){ 
			j=0;
			while(j < col){
				mat1[i][j] = input.nextInt();
				j++;
				}
			i++; 
		}

		System.out.println("Enter the elements of matrix2:");
		 
		i=0;
		while ( i < row){ 
			j=0;
			while(j < col){
				mat2[i][j] = input.nextInt();
				j++;
				}
			i++;
		 
		}
		 
		i=0;
		while ( i < row){ 
			j=0;
			while(j < col)
			{
				result[i][j] = mat1[i][j] + mat2[i][j] ; 
				j++;
			}
		i++; 
		}
	
		System.out.println("Sum of the matrices:");
		i=0;
		while ( i < row){ 
			j=0;
			while(j < col){
				System.out.print(result[i][j]+"\t");
				j++;
			}
		System.out.println();
		i++;
		} 
	}
}
