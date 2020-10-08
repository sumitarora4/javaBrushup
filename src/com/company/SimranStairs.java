package com.company;

import java.util.Scanner;

public class SimranStairs {

    public static void main(String[] arg){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

       System.out.println(step(n));
    }

    private static int step(int n1){

        if(n1 == 0 || n1 == 1 ) return 1;
        else if(n1 ==2) return  2;

        return step(n1-1)+ step(n1 -2) + step(n1 -3);
    }
}
