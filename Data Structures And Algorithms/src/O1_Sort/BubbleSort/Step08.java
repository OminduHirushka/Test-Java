package O1_Sort.BubbleSort;

import java.util.Arrays;

public class Step08 {
    public static void sort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
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
