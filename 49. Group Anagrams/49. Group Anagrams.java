/*
 * Problem: 49. Group Anagrams
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/group-anagrams/submissions/1899398905/
 * Language: java
 * Date: 2026-01-28
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        for (List<String> group : map.values()) {
            res.add(group);
        }

        return res;
    }
}
