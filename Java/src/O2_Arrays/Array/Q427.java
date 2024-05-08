package O2_Arrays.Array;

public class Q427 {
    public static boolean equals(int[] a, int[] b) {
        boolean isEqual = true;
        if (a.length != b.length){
            isEqual = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]){
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;
    }

    public static void main(String[] args) {
        int ar[] = {10,20,30,40,50};
        int br[] = {10,20,30,40,50,60};
        int cr[] = {10,20,30,40};
        int dr[] = {10,30,20,40,50};
        int er[] = {10,20,30,40,50};

        System.out.println("ar == br : " + equals(ar, br));         // false
        System.out.println("ar == cr : " + equals(ar, cr));         // false
        System.out.println("ar == dr : " + equals(ar, dr));         // false
        System.out.println("ar == er : " + equals(ar, er));         // true
    }
}
