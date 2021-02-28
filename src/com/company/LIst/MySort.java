package com.company.LIst;

import java.util.Arrays;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-23 18:45
 **/

public class MySort {

    public static void main(String[] args) {

        int input[] = {5, 2, 3, 1};
        mySort(input);
        System.out.println(Arrays.toString(input));
    }

    public static int[] mySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                int k = j + 1;
                int temp;
                if (arr[j] > arr[k]) {
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] =temp;
                }
            }
            //System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
