/*
 * Problem: 2574. Left and Right Sum Differences
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/left-and-right-sum-differences/submissions/1900167458/
 * Language: java
 * Date: 2026-01-28
 */

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];

        leftSum[0]=0;
        for(int i=1;i< nums.length;i++){
            leftSum[i] = leftSum[i-1] +nums[i-1];
        }

        rightSum[nums.length-1]=0;
        for(int j=nums.length-2;j>=0;j--){
            rightSum[j] = rightSum[j+1] + nums[j+1];
        }

        int[] answer = new int[nums.length];
        for(int k=0;k<nums.length;k++){
            answer[k] = Math.abs(leftSum[k] -rightSum[k]);
        }
        return answer;
    }
}
