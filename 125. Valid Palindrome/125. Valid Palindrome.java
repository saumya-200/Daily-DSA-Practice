/*
 * Problem: 125. Valid Palindrome
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-palindrome/
 * Language: java
 * Date: 2026-03-09
 */

class Solution {
    public boolean isPalindrome(String s) {
        int right = s.length()-1;
        int left = 0;
        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(r)){
                right--;
                continue;
            }
            if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }

           left++;
           right--;
        }
        return true;
    }
}
