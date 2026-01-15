/*
 * Problem: 217. Contains Duplicate
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/contains-duplicate/submissions/1885835812/
 * Language: java
 * Date: 2026-01-15
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i: nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        for(int key: freq.keySet()){
            if(freq.get(key)>1){
                return true;
            }
        }
        return false;
    }
}
