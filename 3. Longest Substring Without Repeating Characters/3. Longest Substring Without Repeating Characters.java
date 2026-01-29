/*
 * Problem: 3. Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1900447613/
 * Language: java
 * Date: 2026-01-29
 */

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
