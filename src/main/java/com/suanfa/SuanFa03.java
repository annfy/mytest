package com.suanfa;

import java.util.HashSet;
import java.util.Set;

public class SuanFa03 {

    public static int lengthOfLongestSubstring(String s) {
        //滑动窗口机制
        //1.初始化
        Set<Character> occ = new HashSet<Character>();//存储容器
        int rk = -1;//rk为右指针
        int n = s.length();
        int sum = 0;
        for (int lk = 0; lk < n; ++lk) {//lk为左指针,++lk执行完循环之后再加
            if (lk != 0) {
                //找完一轮,移出首字母
                occ.remove(s.charAt(lk - 1));
            }

            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                //rk+1在范围内,而且不包含在里面
                occ.add(s.charAt(rk + 1));
                ;
            }

            sum = Math.max(sum, rk + 1 - lk);
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "sdihovsjdk";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
