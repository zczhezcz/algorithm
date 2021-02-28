package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-01-21 15:00
 **/

public class StructTrans {
    public static void main(String[] args) {

        //数组转字符串
        String str = Arrays.toString(new String[]{"1", "2", "3"}); //str = "[1,2,3]"
        List<String> strList1 = Arrays.asList("1", "2", "3","3");
        System.out.println("strList1 = "+strList1 );

        //数组转列表
        arrayToList();

        //list转数组
        String[] strArray = (String[]) strList1.toArray();
        //list转String
        strList1.toString();//str = [1,2,3]
        //list转set
        System.out.println(strList1.stream().collect(Collectors.toSet()));

        //字符串转数组
        char [] charArray = str.toCharArray();

    }

    public static void arrayToList() {
        String[] strArray = {"1", "2", "3"};
        //只能读，不能add
        List<String> strList1 = Arrays.asList(strArray);
        //System.out.println("strList1 = " + strList1);

        //使用Steam
        List<String> strList2 = Stream.of(strArray).collect(Collectors.toList());
        strList2.add("4");

        //使用构造函数 + Arrays.asList
        ArrayList<String> strList3 = new ArrayList<>(Arrays.asList(strArray));
        strList3.add("4");

        //使用Collections的addAll
        List<String> strList4 = new ArrayList<>();
        Collections.addAll(strList4, strArray);
        strList4.add("4");

        //使用ArrangeList的addAll
        List<String> strList5 = new ArrayList<>();
        strList5.addAll(Arrays.asList(strArray));

        //如果是基础类型，需要用boxed转换包装类型
        List<Integer> intList = Arrays.stream(new int[]{1, 2, 3,}).boxed().collect(Collectors.toList());
    }
}
