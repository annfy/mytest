package com.suanfa;

public class SuanFa01 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        for (int i = 0; i < twoSum(nums, target).length; i++) {
            System.out.println();
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }


}
