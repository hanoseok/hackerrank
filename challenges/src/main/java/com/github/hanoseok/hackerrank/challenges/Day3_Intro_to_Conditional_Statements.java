package com.github.hanoseok.hackerrank.challenges;

import java.util.Scanner;

/**
 * Created by hanoseok on 2016. 11. 14..
 */
public class Day3_Intro_to_Conditional_Statements {


    public static void main(String[] args) {
        /*
        If  is even and in the inclusive range of  to , print Not Weird
        If  is even and in the inclusive range of  to , print Weird
        If  is even and greater than , print Not Weird
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if(n >= 6 && n <= 20){
                ans = "Weird";
            }
            else{
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }

}
