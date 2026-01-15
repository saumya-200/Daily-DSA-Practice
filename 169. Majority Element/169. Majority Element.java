/*
 * Problem: 169. Majority Element
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/majority-element/submissions/1885844446/
 * Language: java
 * Date: 2026-01-15
 */

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i: nums){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        
        for(int key: freq.keySet()){
            if(freq.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
}
