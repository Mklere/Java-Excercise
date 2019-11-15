package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void Combine_2_Arrays( int arry[][])
    {
        int[] a1 = {11,22,33};
        int[] a2 = {1,2,3};
        int A1 = a1.length;
        int A2 = a2.length;
        int[] a3 = new int[A1 * 2];

        int count = 0;
        for(int i=0; i < A1; i++){
            a3 [count++] = a1[i];
            a3 [count++] = a2[i];
        }
        System.out.println(Arrays.toString(a3));
    }
        }



