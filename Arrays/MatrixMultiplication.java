package com.arrays;

import java.util.*;

class Matrix_Multiplication{
	Scanner sc = new Scanner(System.in);
	int r1, r2, c1, c2, i, j, k, sum;
	int mat1[][], mat2[][], res[][];
	
	void create(){
		System.out.println("Enter the elements of matrix 1:");
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++){
				mat1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of matrix 2:");
		for(i=0;i<r2;i++){
			for(j=0;j<c2;j++){
				mat2[i][j] = sc.nextInt();
			}
		}
	}
	void display(){
		System.out.println("Matrix 1:");
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++){
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Matrix 2:");
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++){
				System.out.print(mat2[i][j]+"\t");
			}
			System.out.println();
		}
	}
	void compute(){
		System.out.println("Multiplied Matrix:");
		for(i=0;i<r1;i++){
			for(j=0;j<c2;j++){
				sum =0;
				for(k=0;k<r2;k++){
					sum += mat1[i][k]*mat2[k][j];
				}
				res[i][j] = sum;
			}
		}
		
		for(i=0;i<r1;i++){
			for(j=0;j<c2;j++){
				System.out.print(res[i][j]+"\t");
			}
			System.out.println();
		}
	}
		
}
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1, r2, c1, c2, i, j, k, sum;
		Scanner sc = new Scanner(System.in);
		
		Matrix_Multiplication mtm = new Matrix_Multiplication();
		
		System.out.println("Enter the number of rows of matrix 1:");
		r1 = sc.nextInt();
		System.out.println("Enter the number of cols of matrix 1:");
		c1 = sc.nextInt();
		System.out.println("Enter the number of rows of matrix 2:");
		r2 = sc.nextInt();
		System.out.println("Enter the number of cols of matrix 2:");
		c2 = sc.nextInt();
		
		if(c1 == r2){
			mtm.create();
		}
		else{
			System.out.println("The matrices can't be multiplied with each other.");
		}
		
		mtm.display();
		mtm.compute();
	}

}
