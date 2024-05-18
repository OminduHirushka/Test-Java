package Assignment.O1_FOP.A7;

import java.util.Arrays;

public class Q18 {
    public static char[] merge(char[] vw1, char[] vw2) {
        int a = vw1.length;
        int b = vw2.length;

        char[] mg = new char[a + b];
        System.arraycopy(vw1, 0, mg, 0, a);
        System.arraycopy(vw2, 0, mg, a, b);
        return mg;
    }

    public static void main(String[] args) {
        char[] vowels1 = {'a', 'e', 'i', 'o', 'u'};
        char[] vowels2 = {'A', 'E', 'I', 'O', 'U'};
        System.out.println(Arrays.toString(vowels1));     //[a, e, i, o, u]
        System.out.println(Arrays.toString(vowels2));     //[A, E, I, O, U]

        char[] vowelsAll = merge(vowels1, vowels2);
        System.out.println(Arrays.toString(vowelsAll));   //[a, e, i, o, u, A, E, I, O, U]
    }
}
