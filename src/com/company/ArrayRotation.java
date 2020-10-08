package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while( t > 0){

            int n = s.nextInt();

            System.out.println("n="+n);

            int rotation = s.nextInt();

            System.out.println("rotation="+rotation);

            int arr[] = new int[n];

            int arr2[] = new int[n];

            // making array
            for(int i=0; i < n; i++){

                arr[i] = s.nextInt();
            }

            int size = arr.length;
            System.out.println("size="+size);

            for(int j = 1 ; j <= rotation ; j++){

                arr2[j] = arr[size-j];

                System.out.println(" arr2[0]="+ arr2[j]);

                for(int k =0 ; k <= size -2; k++){

                    arr2[k +1] = arr[k];

                    System.out.println(" arr2[k +1]="+ arr2[k +1]);

                }

               }

            System.out.println(Arrays.toString(arr2));

            t--;
        }

    }
}
