package com.company;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-01-10 20:55
 **/

/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
你可以按任意顺序返回答案。。
**/

public class TowNumSum {

    public static int[] getAnswer() {
        int[] source = {1, 5, 8, 4, 6, 7};
        int target = 10;
        int[] result = new int[2];

        for (int i = 0; i < source.length; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (source[i] + source[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
