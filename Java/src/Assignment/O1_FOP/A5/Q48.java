package Assignment.O1_FOP.A5;

public class Q48 {
    public static void main(String[] args) {
        int x = 0;

        // int y = x;                          // Output --> 1
        int y = 11;                            // Output --> 12
        // int y = 13;                         // Output --> 14
        // int y = 10;                         // Output --> 11
        // int y = 12;                         // Output --> 13

        do { } while (x++ < y);
        System.out.println(x);
    }
}
