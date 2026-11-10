package Twentythree_oct;

import java.util.Scanner;

public class Matrix_add_sub {
    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        int[][] a = new int[rows][cols];
	        int[][] b = new int[rows][cols];

	        System.out.println("Enter first matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("Enter second matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                b[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("Matrix Addition:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print((a[i][j] + b[i][j]) + "\t");
	            }
	            System.out.println();
	        }

	        System.out.println("Matrix Subtraction:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print((a[i][j] - b[i][j]) + "\t");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }

}
