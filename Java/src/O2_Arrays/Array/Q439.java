package O2_Arrays.Array;

import java.util.Arrays;

public class Q439 {
    public static boolean isDuplicate(int value, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int[] removeDuplicate(int[] a) {
        int b[] = new int[0];

        for (int i = 0; i < a.length; i++) {
            if (!isDuplicate(a[i], b)) {
                int temp[] = new int[b.length + 1];
                for (int j = 0; j < b.length; j++) {
                    temp[j] = b[j];
                }
                temp[temp.length - 1] = a[i];
                b = temp;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int ar[] = {32, 45, 68, 74, 59, 99, 14, 39, 24, 99, 92};
        System.out.println(Arrays.toString(ar));                        // [32, 45, 68, 74, 59, 99, 14, 39, 24, 99, 92]

        int br[] = removeDuplicate(ar);
        System.out.println(Arrays.toString(br));                        // [32, 45, 68, 74, 59, 99, 14, 39, 24, 92]
    }
}
