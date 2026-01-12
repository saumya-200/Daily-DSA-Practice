public class CheckSortedArray {
    public static void main(String[] args) {
        int[] rr = { 1, 23, 0, 2, 4, 456, 4, 12, 679, 100, 1, 4, 6, 78 };
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Unsorted");
                return;
            }
        }
        System.out.println("Sorted");

    }

}
// the concept of "return" it stops the program and ends it at that point