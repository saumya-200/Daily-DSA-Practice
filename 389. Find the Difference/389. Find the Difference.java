/*
 * Problem: 389. Find the Difference
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-the-difference/
 * Language: java
 * Date: 2026-01-29
 */

class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;
        for(char cs : s.toCharArray()) c^=cs;
        for(char ct : t.toCharArray()) c^=ct;
        return c;
    }
}
