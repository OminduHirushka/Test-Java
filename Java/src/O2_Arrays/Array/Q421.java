package O2_Arrays.Array;

import java.util.Arrays;

public class Q421 {
    public static int[] mergeTwoArrays(int[] ar, int[] br){
        int[] temp = new int[ar.length + br.length];

        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[i];
        }

        for (int i = 0; i < br.length; i++) {
            temp[i+ ar.length] = br[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int ar[] = {100, 200, 300, 400, 500, 600};
        int br[] = {10, 20, 30, 40, 50, 60};

        int cr[];
        cr = mergeTwoArrays(ar, br);

        System.out.println(Arrays.toString(ar));        // [100, 200, 300, 400, 500, 600]
        System.out.println(Arrays.toString(br));        // [10, 20, 30, 40, 50, 60]
        System.out.println(Arrays.toString(cr));        // [100, 200, 300, 400, 500, 600,10, 20, 30, 40, 50, 60]
    }
}
