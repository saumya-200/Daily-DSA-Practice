/*
 * Problem: 1480. Running Sum of 1d Array
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/running-sum-of-1d-array/submissions/1892532539/
 * Language: java
 * Date: 2026-01-21
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(i==0){
                sums[0]=nums[0];
            }else{
                sums[i]=sums[i-1]+nums[i];
            }
        }
        return sums;
    }
}
