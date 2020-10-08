package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();

        System.out.println("testCases="+testCases);


        int gCost = s.nextInt();
        System.out.println("gCost="+gCost);

        int pCost = s.nextInt();
        System.out.println("pCost="+pCost);

        int n = s.nextInt();
        System.out.println("n="+n);

        while (testCases > 0) {

            int aa = s.nextInt();
            int bb = s.nextInt();

            int a = 0;
            int b = 0;

            for (int i = 0; i < n; i++) {

                if(aa == 1){
                    a ++;
                }
                if(bb == 1){
                    b ++;
                }
            }

            int x = Math.min(a,b) * Math.max(gCost,pCost);
            System.out.println("xmax="+Math.max(gCost,pCost));
            System.out.println("x="+x );
            int y = Math.max(a,b) * Math.min(gCost,pCost);
            System.out.println("y"+y );

            System.out.println(x + y);

            testCases--;
        }
    }
}
