package O2_Arrays.Array;

import java.util.Arrays;

public class Q450 {
    public static int a[] = {32, 45, 68, 74, 59, 99, 14, 39};

    public static void add(int value) {
        int temp[] = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        temp[temp.length - 1] = value;
        a = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(a));            // [32, 45, 68, 74, 59, 99, 14, 39]
        System.out.println("Length : " + a.length);        // 8

        // add 99 to last index of array
        add(99);

        System.out.println(Arrays.toString(a));            // [32, 45, 68, 74, 59, 99, 14, 39, 99]
        System.out.println("Length : " + a.length);        // 9
    }
}
