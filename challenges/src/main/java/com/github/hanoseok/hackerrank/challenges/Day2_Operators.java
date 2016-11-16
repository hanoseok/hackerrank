package com.github.hanoseok.hackerrank.challenges;

import java.util.Scanner;

/**
 * Created by hanoseok on 2016. 11. 13..
 */
public class Day2_Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = mealCost * tipPercent * 0.01;
        double tax = mealCost * taxPercent * 0.01;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tip + tax);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

}
