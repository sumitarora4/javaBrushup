package com.company;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse2 {

    public static void main(String arg[]){


        Scanner s = new Scanner(System.in);
        String total = s.nextLine();                 // Reading input from STDIN
//        System.out.println("totalCount"+ total);

        int arr1[] = new int[Integer.parseInt(total)];

        for(int k=0; k < Integer.parseInt(total); k++){
            arr1[k] =  Integer.parseInt(s.nextLine());
        }

     /*   int arr2[] = new int[Integer.parseInt(total)] ;

//      System.out.println("Hi, " + name + ".");
//		int[] arr1 = new int[] {4, 12, 7, 15, 9};
//		int arr2[] = new int[5] ;

        int size = arr1.length;
//		System.out.println("size="+size);

        for(int i=arr1.length-1; i>=0; i--){
//			System.out.println("arr1{"+i+"}="+arr1[i]);
            arr2[size-i-1] = arr1[i];
            int sz = size -i-1;
            System.out.println(arr2[size-i-1]);

        }

*/
        int[] arr2 = new int[arr1.length - 1];

        int size = arr1.length;
        double mul = 0 ;

//        BigInteger mul = new BigInteger("0");

        for(int j=0, k=0; j < arr2.length ; j++){



//            mul = powerFunction(arr1[j],arr1[j+1]);
//             mul = (new Double(Math.pow(arr1[j],arr1[j+1]))).longValue() ;

            mul = Math.pow(arr1[j],arr1[j+1]);
            int max = Arrays.stream(arr2).max().getAsInt();

            System.out.println("max="+max);

            int index = Arrays.binarySearch(arr2, max);

            System.out.println("index="+index);

            if (j == index) {
                continue;
            }


            arr2[k++] = arr1[j];

        }




        System.out.println("mul="+mul);

		/*int size2 = arr2.length;
		System.out.println("size2="+size2);
		System.out.println(Arrays.toString(arr2));*/
    }

    static long powerFunction(int n1, int n2){

        long result = 1;
        while (n2 != 0)
        {
            result *= n1;
            --n2;
        }

        return  result;
    }

}
