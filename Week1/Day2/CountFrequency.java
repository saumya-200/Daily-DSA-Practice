package Day2;

import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        String s = "leetcode";
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            // we are subtracting from 'a' b/c the Unicode of 'a' is 97 so
            // if we don't we'll end up having index value that we have not made
        }
        System.out.println("The frequency is: " + Arrays.toString(freq));

    }

}
