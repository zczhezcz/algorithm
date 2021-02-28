package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-04 17:28
 **/
/*给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
输入: s = "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */


public class MaxStr {
    public static void main(String[] args) {
        System.out.println("~~~~:" + getMaxStr());
    }

    public static String getMaxStr() {
        String s = "abcabcdb";
        List<String> target = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            target.add(String.valueOf(s.charAt(i)));
            for (int j = i + 1; j < s.length(); j++) {
                String next = String.valueOf(s.charAt(j));
                if(target.contains(next)){
                    //相同的字符
                    if(target.size() > result.size()){
                        result.clear();
                        result.addAll(target);
                    }
                    target.clear();
                    break;
                }
                target.add(next);

            }
        }
        return result.toString();
    }
}
