package O1_Sort.BubbleSort;

import java.util.Arrays;

public class Step03 {
    public static void sort(int[] ar) {
        if (ar[0] > ar[1]) {
            int temp = ar[0];
            ar[0] = ar[1];
            ar[1] = temp;
        }
        if (ar[1] > ar[2]) {
            int temp = ar[1];
            ar[1] = ar[2];
            ar[2] = temp;
        }
        if (ar[2] > ar[3]) {
            int temp = ar[2];
            ar[2] = ar[3];
            ar[2] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {45, 16, 44, 79, 93, 99, 21, 64, 83};
        System.out.println(Arrays.toString(arr));               // [45,16,44,79,93,99,21,64,83]
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
