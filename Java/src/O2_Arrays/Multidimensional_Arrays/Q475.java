package O2_Arrays.Multidimensional_Arrays;

public class Q475 {
    public static void main(String[] args) {
        int br[][] = new int[3][];
        System.out.println("Length of br : " + br.length);          // 3

        br[0] = new int[4];
        br[1] = new int[3];
        br[2] = new int[6];

        System.out.println("Length of br[0] : " + br[0].length);    // 4
        System.out.println("Length of br[1] : " + br[1].length);    // 3
        System.out.println("Length of br[2] : " + br[2].length);    // 6
    }
}
