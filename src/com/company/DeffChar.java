package com.company;

import java.util.ArrayList;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-01-10 21:30
 **/

//找出给定字符串中不重复的字符
public class DeffChar {

    public static void main(String[] args){
        System.out.println("~~~~:" + getAnswer().toString());
    }

    static ArrayList<String> getAnswer() {
        String source = "abcabdda";
        ArrayList<String> compareList = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        int currentMax = 0;

        for (int i = 0; i < source.length(); i++) {
            compareList.add(String.valueOf(source.charAt(i)));

            for (int j = i + 1; j < source.length(); j++) {
                if (!compareList.contains(String.valueOf(source.charAt(j)))) {
                    compareList.add(String.valueOf(source.charAt(j)));
                    System.out.println("compareList = "+ compareList);
                } else {
                    //遇到相同字符
                    if (compareList.size() >= currentMax) {
                        currentMax = compareList.size();
                        resultList.clear();
                        resultList.addAll(compareList);
                        compareList.clear();
                        System.out.println("resultList = "+ resultList);
                    }
                    break;
                }
            }
        }
        return resultList;
    }
}
