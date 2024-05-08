package O2_Arrays.Array;

public class Q448 {
    public static int y = 100;

    public static void increment(int x) {
        x++;
        y++;
    }

    public static void main(String[] args) {
        int x = 200;
        increment(x);
        increment(x);
        increment(x);
        increment(x);

        System.out.println(x);
        System.out.println(y);
    }
}
