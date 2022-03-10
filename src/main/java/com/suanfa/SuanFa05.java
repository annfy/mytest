package com.suanfa;

import sun.security.util.Length;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class SuanFa05 {


    //暴力破解法
    /*
    public static String longestPalindrome(String s) {
        if (s.length()<2){
            return s;
        }
        char[] chars=s.toCharArray();
        int len=chars.length;
        int maxLength=1;
        int begin=0;
        for (int i = 0; i <len-1; i++) {
            for (int j = i+1; j <len; j++) {
                if (j-i+1>maxLength&&validPalindromic(chars,i,j)){
                    maxLength=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxLength);
    }

    public static boolean validPalindromic(char[] charArray,int left,int right){
        while (left<right){
            if (charArray[left]!=charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    */

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        char[] chars = s.toCharArray();
        int maxLen = 1, begin = 0;
        //dp[left][right]是否为回文
        boolean[][] dp = new boolean[len][len];
        //将对角线上的字符段全部设为true
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int left=0;left<len;left++){
            for (int right = 1; right < len; right++) {
                if (chars[left]!=chars[right]){
                    dp[left][right]=false;
                }else{
                    if (right-left+1<2) {
                        dp[left][right] = true;
                    }else {
                        dp[left][right]=dp[left+1][right-1];
                    }
                }

                //区间成立,判断区间长度
                if (dp[left][right]&&right-left+1>maxLen){
                    maxLen=right-left+1;
                    begin=left;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }


    public static void main(String[] args) {
        String s = "bkajscjkas";
        System.out.println(longestPalindrome(s));

    }
}
