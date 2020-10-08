package com.company;

import java.util.Scanner;

public class StdInAndStdOut {

    public static void main(String arg[]){

        Scanner scan = new Scanner(System.in);
        /*int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        if(scan.hasNextLine() || s.isEmpty()){
            s = scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/


        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 !=0) System.out.println("Weird");
        else if(N % 2 ==0 && 2<= N && N <=5) System.out.println("Not Weird");
        else if(N % 2 ==0 && 6<= N && N <=20) System.out.println("Weird");
        else if(N % 2 ==0 && N>20) System.out.println("Not Weird");

        scan.close();



    }
}
