/*
 * Problem: 11. Container With Most Water
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/container-with-most-water/submissions/1946301920/
 * Language: java
 * Date: 2026-03-12
 */

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length -1;
        int maxArea=0;

        while (left < right){
            int width = right-left;
            int hei = Math.min(height[left],height[right]);
            int area = width*hei;
            maxArea = Math.max(maxArea,area);

            if (height[left]< height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
