/*
 * Problem: 26. Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1943014963/
 * Language: java
 * Date: 2026-03-09
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1; 
        for(int i=1;i< nums.length;i++){
            if (nums[i] != nums[i-1]){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
