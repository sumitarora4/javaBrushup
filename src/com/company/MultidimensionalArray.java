package com.company;

import java.util.Scanner;

public class MultidimensionalArray  {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int m =2, n =3;
        int[][] arr = new int[m][n];

//        int[][] arr ={{1,2,3},{4,5,6}};

        for(int ii=0; ii<m; ii++){

            String[] arrRowItems = s.nextLine().split(" ");

            for(int jj=0; jj< n ; jj++){

                    int arrItem = Integer.parseInt(arrRowItems[jj]);
                    arr[ii][jj] = arrItem;
            }
        }

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
