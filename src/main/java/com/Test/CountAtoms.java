package com.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 计算元素的原子数,几种不同的化学式
 * 1、有括号的类型
 * 对括号进行判断
 * 如何获取不同长度的单个原子（大小写差异）
 * 括号内部的数字如何与外部数字相乘（字符数字转换）
 * <p>
 * 2、无括号的类型
 * 如何将前后原子相加
 * <p>
 * 存储容器，Map集合？
 */
public class CountAtoms {

    private static String elements;

    /**
     * 计算原子数
     * @param elements 化学式
     * @return
     */
    public static String countAtomsNumber(String elements) {
        int index = 0;
        int length = elements.length();
        //lis集合用来存放Map
        //键存储原子，value值存储数量,遇到重复的键值获取value值并将新的数量加入其中再次加入Map
        List<Map<String, Integer>> mapList = new ArrayList<Map<String, Integer>>();
        while (index < length) {
            //获取第一个字符
            char ch = elements.charAt(index);
            //首先判断是不是括号
            if (ch == '(') {
                index++;
            } else if (ch == ')') {
                index++;


            } else {
                //不是括号的情况
                String automsName = isAutomsName(index);
                int number = isNumber(index);


            }


        }


        return null;
    }

    /**
     * 判断是不是数字
     *
     * @param index 当前索引位置
     * @return
     */
    public static int isNumber(int index) {
        int number = 0;
        //超出范围,或者当前字符不是数字返回1
        if (index >= elements.length() || !(48 <= elements.charAt(index) && elements.charAt(index) <= 57)) {
            return 1;
        }
        //是数字记录下来,并且将字符型数字转换成整型数字
        while (index < elements.length() && 48 <= elements.charAt(index) && elements.charAt(index) <= 57) {
            number = number * 10 + (elements.charAt(index++) - '0');
        }
        return number;
    }

    /**
     * 截取原子名称
     *
     * @param index 当前索引位置
     * @return
     */
    public static String isAutomsName(int index) {
        String str;
        StringBuffer StringBuffer = new StringBuffer();
        //获取原子的首字母
        StringBuffer.append(elements.charAt(index++));
        //字母小写的时候跳出循环,得到元素名称
        while (index < elements.length() && Character.isLowerCase(elements.charAt(index))) {
            StringBuffer.append(elements.charAt(index++));
        }
        str = StringBuffer.toString();
        return str;
    }


    public static void main(String[] args) {
        countAtomsNumber("CaCo3");
        countAtomsNumber("Fe2(S04)3");

    }

}
