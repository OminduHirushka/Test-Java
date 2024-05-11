package O2_Arrays.Multidimensional_Arrays;

public class Q478 {
    public static void main(String[] args) {
        int x = 0;
        int[] a = new int[2];
        int[][] b = new int[4][2];
        int[][][] c = new int[4][4][5];
        int[][][][] d = new int[2][3][5][7];


        // a = x;                                   // Illegal, a-> 1D array reference variable, x -> primitive int
        a[0] = x;                                   // Legal
        a = b[0];                                   // Legal a-> iD, b[0] -> 1D
        a[0] = b[0][0];                             // Legal, both are int
        c[0][0] = b[0];                             // Legal
        // c[0][0] = a[0];                          // Illegal
        d[0][0][0][0] = c[0][0][0];                 // Legal
    }

}
