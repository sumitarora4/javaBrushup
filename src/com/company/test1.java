package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class test1 {

    public static void main(String[] arg) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        long res = 1;

//        while (t > 0) {

            int arr1[] = new int[t];

            // making array
            for(int i=0; i < arr1.length; i++){

                arr1[i] = s.nextInt();
            }

//            int[] arr1 = {4, 7, 16, 14, 18};
            int size = arr1.length;

            for (int i = -1; i < size ; i++) {

                res = xorOfArray(arr1, arr1.length);
                System.out.println("xor=" + res);

                if(arr1.length != 0) {
                    int max = Arrays.stream(arr1).max().getAsInt();
                    System.out.println("max=" + max);

                    int index = Arrays.binarySearch(arr1, max);
                    System.out.println("index=" + index);

                    arr1 = removeTheElement(arr1, index);
                    System.out.println("Resultant Array: " + Arrays.toString(arr1));
                }
            }

            t--;
//        }

    }

    static int xorOfArray(int arr[], int n) {
        // Resultant variable
        System.out.println("inside xorofArray: " + Arrays.toString(arr));
        System.out.println("n: " + n);

        int xor_arr = 0;

        // Iterating through every element in the array
        for (int i = 0; i < n; i++) {

            // Find XOR with the result
            xor_arr = xor_arr ^ arr[i];
        }

        // Return the XOR
        return xor_arr;
    }

    public static int[] removeTheElement(int[] arr, int index) {
        // If the array is empty
        // or the index is not in array range
        // return the original array

        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // return the resultant array
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }



           /* int num = s.nextInt();
            int result = 0;

            // find all divisors which divides 'num'
            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                // if 'i' is divisor of 'num'
                if (num % i == 0)
                {
                    // if both divisors are same then
                    // add it only once else add both
                    if (i == (num / i))
                        result += i;
                    else
                        result += (i + num / i);
                }
            }

            // Add 1 to the result as 1 is also
            // a divisor
//            System.out.println (result + 1);

            if(result + 1 == num){
                System.out.println ("YES");
            }
            else {
                System.out.println ("NO");
            }*/


}
