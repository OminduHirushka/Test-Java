package Assignment.O1_FOP.A7;

import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {
        int[] array = {100, 200, 300};
        System.out.println(Arrays.toString(array));

        for (int a : array) {
            a++;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
        System.out.println(Arrays.toString(array));
    }
}
