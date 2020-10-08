package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromicString {

    public static void main (String arg[]){

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        char arr1[] = new char[str.length()];
        char arr2[] = new char[str.length()];

        for(int i =0 ; i < str.length() ; i++){

            arr1[i] = str.charAt(i);
            arr2[i] = str.charAt(str.length()-1 - i);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if(Arrays.equals(arr1, arr2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
