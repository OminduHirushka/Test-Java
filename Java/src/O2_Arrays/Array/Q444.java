package O2_Arrays.Array;

import java.util.Arrays;

public class Q444 {
    public static int[] add(int[] a, int value) {
        int temp[] = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        temp[temp.length - 1] = value;
        a = temp;
        return a;
    }

    public static void main(String[] args) {
        int ar[] = {32, 45, 68, 74, 59, 99, 14, 39};
        System.out.println(Arrays.toString(ar));            // [32, 45, 68, 74, 59, 99, 14, 39]
        System.out.println("Length : " + ar.length);        // 8

        // add 99 to last index of array

        /*
        int temp[] = new int[ar.length+1];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[i];
        }
        temp[temp.length-1] = 99;
        ar = temp;
        */

        ar = add(ar, 99);

        System.out.println(Arrays.toString(ar));            // [32, 45, 68, 74, 59, 99, 14, 39, 99]
        System.out.println("Length : " + ar.length);        // 9
    }
}
