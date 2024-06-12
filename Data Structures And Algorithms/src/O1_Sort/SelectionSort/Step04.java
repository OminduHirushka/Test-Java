package O1_Sort.SelectionSort;

import java.util.Arrays;

public class Step04 {
    public static void sort(int[] ar) {
        for (int i = ar.length - 1; i > 0; i--) {
            int max = ar[0];
            int index = 0;

            for (int j = 1; j <= i; j++) {
                if (ar[j] > max) {
                    max = ar[j];
                    index = j;
                }
            }

            ar[index] = ar[i];
            ar[i] = max;
        }
    }

    public static void main(String[] args) {
        int arr[] = {45, 16, 44, 79, 93, 99, 21, 64, 83};
        System.out.println(Arrays.toString(arr));               // [45,16,44,79,93,99,21,64,83]
        sort(arr);
        System.out.println(Arrays.toString(arr));               // [16,21,44,45,64,79,83,93,99]
    }
}
