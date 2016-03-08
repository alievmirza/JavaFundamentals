package com.epam.courses.jf.homework;

import java.util.Scanner;

/**
 * Created by mirza on 03.03.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("\n" + "Enter the amount of numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n % 2 != 0) {
            System.out.println("The amount must be an even, enter again: ");
            n = sc.nextInt();
        }
        double[] array = new double[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextDouble();
        }
        double max = array[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("The maximum is: ");
        System.out.println(max);
    }

}
