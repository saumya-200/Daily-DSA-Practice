/*
 * Problem: 11. Container With Most Water
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/container-with-most-water/submissions/1900681399/
 * Language: java
 * Date: 2026-01-29
 */

class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res=0;
        while(l<r){
            int area=Math.min(height[l],height[r])*(r-l);
            res=Math.max(res,area);
            if (height[l]<height[r]){
                l=l+1;
            }
            else{
                r=r-1;
            }
        }
        return res;
            
        }
    }
