/*
 * Problem: 167. Two Sum II - Input Array Is Sorted
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/1942925731/
 * Language: java
 * Date: 2026-03-09
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length-1;
        int left = 0;
        int[] output = new int[2];

        while(left < right){
            if(numbers[left]+ numbers[right]==target){
                output[0]=left+1;
                output[1] = right+1;
            }
            if (numbers[left]+numbers[right] < target){
                left++;
            }
            else{
                right--;
            }
    
        }
        return output;
        
    }
}
