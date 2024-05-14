package O1_Sort.BubbleSort;

import java.util.Arrays;

public class Step05 {
    public static void sort(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] > ar[i + 1]) {
                int temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {45, 16, 44, 79, 93, 99, 21, 64, 83};
        System.out.println(Arrays.toString(arr));               // [45,16,44,79,93,99,21,64,83]
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
