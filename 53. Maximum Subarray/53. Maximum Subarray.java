/*
 * Problem: 53. Maximum Subarray
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/maximum-subarray/submissions/1907001901/
 * Language: java
 * Date: 2026-02-03
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=1; i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);

        }
        return maxSum;
    }
}
