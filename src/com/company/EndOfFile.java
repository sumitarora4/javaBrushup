package com.company;

import java.util.Scanner;

public class EndOfFile {

    private static  Scanner s;

    public static void main(String[] arg) {

     /*   Scanner s = new Scanner(System.in);
        int count = 1;
        while(s.hasNext()){

                String str = s.nextLine();

            System.out.println(count +" "+ str);
            count ++;
        }*/


        // recursive way
        s = new Scanner(System.in); // initialize only once
        checkString(1);
    }

    public static void checkString(int count) {

        if (s.hasNext()) {

            String str = s.nextLine();
            System.out.println(count + " " + str);
            checkString(count + 1);
        }
    }

}