/*
 * Problem: 242. Valid Anagram
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-anagram/submissions/1883806977/
 * Language: java
 * Date: 2026-01-13
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        for(int i =0; i<s.length();i++){
            freq[s.charAt(i) -'a']++;
        }
        for(int j=0; j<t.length();j++){
            freq[t.charAt(j)-'a']--;
        }
        for(int k=0;k<freq.length;k++){
            if(freq[k]!=0){
                return false;
            }
        }
        return true;
    
    }
}
