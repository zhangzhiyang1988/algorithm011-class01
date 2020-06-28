package com.zzy.test;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 */
public class RotateArray {
    public static void main(String args[]){
       int[] nums = new int[]{1,2,3,4,5,6,7};
       int k = 3;
       k %= nums.length;
       reverse(nums,0,nums.length-1);
       reverse(nums,0,k-1);
       reverse(nums,k,nums.length-1);
       for (int i=0;i<nums.length;i++){
           System.out.println(nums[i]);
       }
    }

    public static void reverse(int[] nums,int start,int end){
       while (start<end){
           int temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
           start++;
           end--;
       }
    }
}
