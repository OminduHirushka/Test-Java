package O1_Sort.BubbleSort;

import java.util.Arrays;

public class Step09 {
    public static void sort(int[] ar) {
        for (int i = ar.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
                System.out.println(Arrays.toString(ar));
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
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
