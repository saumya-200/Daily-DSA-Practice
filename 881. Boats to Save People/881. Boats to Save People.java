/*
 * Problem: 881. Boats to Save People
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/boats-to-save-people/submissions/1900694306/
 * Language: java
 * Date: 2026-01-29
 */

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<=j){
            if((people[j]+people[i])<=limit){
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
}
