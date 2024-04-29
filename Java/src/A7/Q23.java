package A7;

import java.util.Arrays;

public class Q23 {
    public static void copyRange(int[] a1, int[] a2, int i1, int i2, int l) {
        for (int i = 0; i < l; i++) {
            a2[i2 + i] = a1[i1 + i];
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        int i1 = 1;
        int i2 = 2;
        int l = 3;

        System.out.print("'a1' : ");
        System.out.println(Arrays.toString(a1));
        System.out.print("'a2' : ");
        System.out.println(Arrays.toString(a2));

        copyRange(a1, a2, i1, i2, l);

        System.out.print("New 'a2': ");
        for (int num : a2) {
            System.out.print(num + " ");
        }
    }
}
