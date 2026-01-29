/*
 * Problem: 315. Count of Smaller Numbers After Self
 * Difficulty: Hard
 * Link: https://leetcode.com/problems/count-of-smaller-numbers-after-self/submissions/1900594251/
 * Language: java
 * Date: 2026-01-29
 */

class Solution {

    static class Pair {
        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }

    int[] count;

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;
        count = new int[n];

        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        mergeSort(arr, 0, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int c : count) {
            result.add(c);
        }
        return result;
    }

    private void mergeSort(Pair[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(Pair[] arr, int left, int mid, int right) {
        List<Pair> temp = new ArrayList<>();

        int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr[i].val <= arr[j].val) {
                temp.add(arr[j]);
                j++;
            } else {
                // all remaining elements in right half are smaller
                count[arr[i].idx] += (right - j + 1);
                temp.add(arr[i]);
                i++;
            }
        }

        while (i <= mid) temp.add(arr[i++]);
        while (j <= right) temp.add(arr[j++]);

        for (int k = left; k <= right; k++) {
            arr[k] = temp.get(k - left);
        }
    }
}

