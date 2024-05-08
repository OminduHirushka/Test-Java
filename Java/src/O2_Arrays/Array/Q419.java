package O2_Arrays.Array;

import java.util.*;

public class Q419 {
    public static void copyValueFromTo(int[] from, int[] to){
        int minLength = from.length > to.length ? to.length : from.length;
        /*
        int minLength;

        if (from.length > to.length) {
            minLength = to.length;
        } else {
            minLength = from.length;
        }
        */
        for (int i = 0; i < minLength; i++) {
            to[i] = from[i];
        }
    }

    public static void main(String[] args) {
        int ar[] = {100, 200, 300, 400, 500, 600};
        int br[] = new int[ar.length];
        int cr[] = new int[ar.length-3];
        int dr[] = new int[ar.length+3];

        copyValueFromTo(ar, br);
        copyValueFromTo(ar, cr);
        copyValueFromTo(ar, dr);

        System.out.println(Arrays.toString(ar));        // [100, 200, 300, 400, 500, 600]
        System.out.println(Arrays.toString(br));        // [100, 200, 300, 400, 500, 600]
        System.out.println(Arrays.toString(cr));        // [100, 200, 300]
        System.out.println(Arrays.toString(dr));        // [100, 200, 300, 400, 500, 600, 0, 0, 0]
    }
}
