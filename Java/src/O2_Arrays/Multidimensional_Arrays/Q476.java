package O2_Arrays.Multidimensional_Arrays;

public class Q476 {
    public static void main(String[] args) {
        int br[][] = {{1, 2}, {10, 20, 30, 40}, {100, 200, 300}};

        for (int i = 0; i < br.length; i++) {
            for (int j = 0; j < br[i].length; j++) {
                System.out.print(br[i][j] + " ");
            }
            System.out.println();
        }

        /* for-each
        for (int[] ar : br) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
         */
    }
}
