package com.github.hanoseok.hackerrank.challenges;

import java.util.Scanner;

/**
 * Created by hanoseok on 2016. 11. 13..
 */
public class Day1_Data_Types {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i2 = i + Integer.parseInt(scan.nextLine());
        double d2 = d + Double.parseDouble(scan.nextLine());
        String s2 = s + scan.nextLine();
        System.out.println(i2);
        System.out.println(d2);
        System.out.println(s2);
         /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */

        scan.close();
    }
}
