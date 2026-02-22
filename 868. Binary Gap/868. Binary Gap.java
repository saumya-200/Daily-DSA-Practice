/*
 * Problem: 868. Binary Gap
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/binary-gap/submissions/1927130204/?envType=daily-question&envId=2026-02-22
 * Language: java
 * Date: 2026-02-22
 */

class Solution {
    public int binaryGap(int n) {
        int lastPos = -1;   // position of previous 1
        int maxGap = 0;
        int pos = 0;        // current bit position

        while (n > 0) {
            if ((n & 1) == 1) {   // check if current bit is 1
                if (lastPos != -1) {
                    maxGap = Math.max(maxGap, pos - lastPos);
                }
                lastPos = pos;
            }
            n >>= 1;   // right shift to process next bit
            pos++;
        }

        return maxGap;
    }
}
