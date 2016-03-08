package com.epam.courses.jf.homework;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by mirza on 28.02.2016.
 */
public class Task2 {

    public static strictfp void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter eps");
        double eps = in.nextDouble();
        double a = 1.0 / 4.0;
        int i = 1;
        do{
            i++;
            a = 1.0 / ((i + 1) * (i + 1));
        }while(a >= eps);
        System.out.print("The number that satisfies the condition is ");
        System.out.println(i);
        a = 1.0 / 4.0;
        i = 1;
        do{
            System.out.println(a);
            i++;
            a = 1.0 / ((i + 1) * (i + 1));
        }while(a >= eps);


    }

}
