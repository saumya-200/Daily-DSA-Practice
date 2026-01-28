/*
 * Problem: 443. String Compression
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/string-compression/submissions/1899457679/
 * Language: java
 * Date: 2026-01-28
 */

class Solution {
    public int compress(char[] chars) {
        int write = 0;  
        int read = 0;    

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}

