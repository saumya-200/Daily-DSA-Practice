/*
 * Problem: 303. Range Sum Query - Immutable
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/range-sum-query-immutable/submissions/1893676728/
 * Language: java
 * Date: 2026-01-22
 */

class NumArray {
    private int[] prefix;
    public NumArray(int[] nums) {

        prefix= new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right+1]-prefix[left];

    }

}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
