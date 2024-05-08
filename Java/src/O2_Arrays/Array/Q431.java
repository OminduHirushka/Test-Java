package O2_Arrays.Array;

import java.util.Arrays;

public class Q431 {
    public static void printSecondmax(int[] a) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secMax = max;
                max = a[i];
            } else if (a[i] > secMax && a[i] != max) {
                secMax = a[i];
            }
        }

        if (secMax == Integer.MIN_VALUE) {
            System.out.println("There is no second max in this array");
        } else {
            System.out.println("Second Max : " + secMax);
        }
    }

    public static void main(String[] args) {
        int ar[] = {32, 45, 68, 74, 59, 99, 14, 39, 24, 64, 92};
        System.out.println(Arrays.toString(ar));                        // [32,45,68,74,59,99,14,39,24,64,92]
        printSecondmax(ar);                                             // Second Max : 92

        int br[] = {32, 45, 68, 74, 59, 99, 14, 99, 24, 64, 92};
        System.out.println(Arrays.toString(br));                        // [32,45,68,74,59,99,14,99,24,64,92]
        printSecondmax(br);                                             // Second Max : 92

        int cr[] = {90, 90, 90, 90, 90};
        System.out.println(Arrays.toString(cr));                        // [90, 90, 90, 90, 90]
        printSecondmax(cr);                                             // There is no second max in this array
    }
}
