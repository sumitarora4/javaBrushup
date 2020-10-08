package com.company;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] arg){

        Scanner s = new Scanner(System.in);

        String n = s.nextLine();
        String str = String.valueOf(n);

        try {
            if (str instanceof String) {
                System.out.println("Good job");
            }
            else{
                System.out.println("Wrong answer");
            }

        }
        catch(Exception ex)

                {
                    System.out.println("Wrong answer");
                }

    }
}
