package com.company;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-04 16:55
 **/
/*
给定一个数组 nums ，找到一个具有最大和的连续子数组，返回其最大和。
示例:
    输入: [-2,1,-3,4,-1,2,1,-5,4]
    输出: 6
    解释: 连续子数组 [4,-1,2,1] 的和最大，为 6
 **/
public class MaxSum {

    static int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    static int maxValue = 0;
    static int beginIndex = -1;
    static int endIndex = -1;
    public static void main(String[] arg){
        System.out.println("~~~"+getMaxSum());
    }

    static int getMaxSum() {

        for (int i = 0; i < array.length; i++) {
            int sum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                sum = sum + array[j];
                //System.out.println("i = " + i + "; j = " + j + "; sum = "+sum);
                if (sum > maxValue) {
                    maxValue = sum;
                    beginIndex = i;
                    endIndex = j;
                }
            }
        }
        System.out.println(beginIndex + "~" + endIndex);
        return maxValue;
    }


}
