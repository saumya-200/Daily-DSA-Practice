import java.util.*;

public class LargestElementArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 65, 3, 0, 78, 89, 4 };
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
