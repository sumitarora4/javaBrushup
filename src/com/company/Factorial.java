package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int fact = 1;

        for(int i =1  ; i <= n ; i++){

             fact = fact * i;
        }

        System.out.println("fac=="+fact);


    }
}
