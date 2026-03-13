/*
 * Problem: 75. Sort Colors
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/sort-colors/submissions/1947283709/
 * Language: java
 * Date: 2026-03-13
 */

class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums); lollllll
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int temp = 0; 

        while(mid <= high){
            if(nums[mid]==0){
                temp = nums[low];
                nums[low]= nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                temp = nums[high];
                nums[high]= nums[mid];
                nums[mid] = temp;
                high--;

            }
        }

        return;

    }
}
