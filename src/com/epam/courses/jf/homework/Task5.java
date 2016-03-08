package com.epam.courses.jf.homework;

import java.util.Scanner;

/**
 * Created by mirza on 03.03.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter width of square matrix");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j || i == (n - j - 1) ) {
                    matrix[i][j] = 1;
                }
            }
        }
        System.out.println("The answer is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}


