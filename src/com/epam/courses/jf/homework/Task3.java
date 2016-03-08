package com.epam.courses.jf.homework;

import java.util.Scanner;

/**
 * Created by mirza on 03.03.2016.
 */
public class Task3 {
    public static strictfp void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter h: ");
        double h = sc.nextDouble();
        System.out.println("Result is:");
        for (double i = a; i <= b ; i += h) {
            System.out.printf("%.4f %.4f \n", i, (Math.tan(2.0 * i) - 3.0) );
        }
    }
}
