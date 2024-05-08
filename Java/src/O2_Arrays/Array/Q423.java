package O2_Arrays.Array;

import java.util.Arrays;

public class Q423 {
    public static int searchIndex(int[] ar, int key){
        int i = -1;

        for (int j = 0; j < ar.length; j++) {
            if (key == ar[j]){
                i = j;
                // break; (First Index)
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int ar[] = {32,45,68,74,59,99,14,39,24,68,92};
        System.out.println(Arrays.toString(ar));

        int index;
        int key;

        key = 68;
        index = searchIndex(ar, key);
        System.out.println("Index of " + key + " : " + index);      // 2

        key = 14;
        index = searchIndex(ar, key);
        System.out.println("Index of " + key + " : " + index);      // 6

        key = 100;
        index = searchIndex(ar, key);
        System.out.println("Index of " + key + " : " + index);      // -1
    }
}
