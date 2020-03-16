package com.arrays;

import java.util.*;

class Matrix_Addition{
	Scanner sc;
	int matrix1[][], matrix2[][], sum[][];
	int row, col;
	
	void create(){
		sc = new Scanner(System.in);
		System.out.println("Matrix Addition");
		
		System.out.println("Enter number of rows and columns:");
		row = Integer.parseInt(sc.nextLine());
		col = Integer.parseInt(sc.nextLine());
		
		matrix1 = new int[row][col];
		matrix2 = new int[row][col];
		sum = new int[row][col];
		
		System.out.println("Enter data for first matrix:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter data for second matrix:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix2[i][j] = sc.nextInt();
			}
		}
	}
	
	void display(){
		System.out.println("Martix 1:");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Martix 2:");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
	}
	void compute(){
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("Addition of two matrices:");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_Addition mt =  new Matrix_Addition();
		mt.create();
		mt.display();
		mt.compute();
		
	}
}
