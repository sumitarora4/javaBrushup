package com.company;

import java.util.Scanner;

public class CountDivisors {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int r = s.nextInt();
        int k = s.nextInt();

        int count = 0 ;
        for(int i = l ; i <= r ; i++){

            if(i % k == 0){
                count ++; // count of no which are divisible by k
                System.out.println(i); // no. which are divisible by k
            }
        }
        System.out.println(count);

    }
}
