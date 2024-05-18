package Assignment.O1_FOP.A7;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int[] br = new int[]{10, 20, 30, 40, 50};

        // a
        System.out.print("[");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b]");
        // System.out.println(Arrays.toString(ar));

        // b
        for (int i = 0; i < ar.length; i++) {
            ar[i]++;
        }

        // c
        System.out.println(Arrays.toString(ar));

        // d
        if (ar.length == br.length) {
            System.out.println("Both arrays are the same size.");
        } else {
            System.out.println("Size of these arrays are different.");
        }

        // e
        System.out.print("[");
        for (int i = 0; i < ar.length; i++) {
            ar[i] += br[i];
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b]");

        // f
        System.arraycopy(br, 0, ar, 0, br.length);
        System.out.println(Arrays.toString(ar));
    }
}
