package com.company;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-14 22:38
 **/

public class Zhongweishu {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3,7};
        int[] array2 = {1,2, 3, 4,6,9};
        int[] composeArray = getComposeArray(array1, array2);
        System.out.println(Arrays.toString(composeArray));

        if (composeArray.length % 2 == 0) {
            int middle1 = composeArray[composeArray.length / 2 - 1];
            int middle2 = composeArray[composeArray.length / 2];
            System.out.println("result = " + BigDecimal.valueOf(middle1 + middle2).divide(BigDecimal.valueOf(2)));
        } else {
            int middle1 = composeArray[composeArray.length / 2];
            System.out.println("result = " + (middle1 + middle1) / 2);
        }
    }

    public static int[] getComposeArray(int[] array1, int[] array2) {
        int[] composeArray = new int[array1.length + array2.length];
        int array1Index = 0;
        int array2Index = 0;

        for (int i = 0; array1Index < array1.length  && array2Index < array2.length; i++) {
            if (array1[array1Index] <= array2[array2Index]) {
                composeArray[i] = array1[array1Index];
                array1Index++;
            } else {
                composeArray[i] = array2[array2Index];
                array2Index++;
            }
        }
        System.out.println("array1Index = " + array1Index + " ; array2Index = " + array2Index
                + "; composeArray = " + Arrays.toString(composeArray));

        if (array1Index == array1.length) {
            for (int i = array2Index + array1Index; i < array2.length + array1.length; i++) {
                System.out.println("i = " + i + "; array2Index = "+array2Index+"; composeArray = " + Arrays.toString(composeArray));
                composeArray[i] = array2[array2Index++];
            }
        } else {
            for (int i = array2Index + array1Index; i < array1.length + array1.length; i++) {
                System.out.println("i = " + i + "; array1Index = "+array1Index+"; composeArray = " + Arrays.toString(composeArray));
                composeArray[i] = array1[array1Index++];
            }
        }
        return composeArray;
    }
}
