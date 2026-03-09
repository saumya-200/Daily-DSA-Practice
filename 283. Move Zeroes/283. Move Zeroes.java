/*
 * Problem: 283. Move Zeroes
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/move-zeroes/submissions/1942993589/
 * Language: java
 * Date: 2026-03-09
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0;
        int temp;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                temp = nums[slow];
                nums[slow] = nums[i];
                nums[i] = temp;
                slow++;
            }  
        }
        return;
    }
}
