package O2_Arrays.Array;

import java.util.Arrays;

public class Q433 {
    public static boolean isDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int ar[] = {32, 45, 68, 74, 59, 99, 14, 39, 24, 64, 92};
        System.out.println(Arrays.toString(ar));                                        // [32,45,68,74,59,99,14,39,24,64,92]
        System.out.println("Array ar is a duplicate array : " + isDuplicate(ar));       // false

        int br[] = {32, 45, 68, 74, 59, 99, 14, 39, 24, 99, 92};
        System.out.println(Arrays.toString(br));                                        // [32,45,68,74,59,99,14,39,24,99,92]
        System.out.println("Array br is a duplicate array : " + isDuplicate(br));       // true
    }
}
