package O2_Arrays.Array;

import java.util.Arrays;

public class Q449 {
    public static int [] ar= {100, 200, 300, 400, 500};

    public static void increment(){
        for(int i = 0; i < ar.length; i++){
            ar[i]++;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ar)); //[100, 200, 300, 400, 500]
        increment();
        System.out.println(Arrays.toString(ar)); //[101, 201, 301, 401, 501]
    }
}
