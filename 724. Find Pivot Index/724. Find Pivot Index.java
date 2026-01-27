/*
 * Problem: 724. Find Pivot Index
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-pivot-index/submissions/1898722849/
 * Language: java
 * Date: 2026-01-27
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        for(int i= 0;i<nums.length;i++){
                if(i==0){
                    prefix[i]= nums[0];
                }else{
                    prefix[i] = nums[i]+prefix[i-1];
                }
        }

        //total = leftsum + nums[i] + rightsum;

        if (prefix[prefix.length - 1] - nums[0] == 0) {
                return 0;
        }
        
        for(int j=1;j<prefix.length;j++){
            int leftSum=prefix[j-1];
            int rightSum= prefix[prefix.length-1] -leftSum-nums[j];
            if(rightSum==leftSum){
                return j;
         }
            }
        
                return -1;


    }
}
