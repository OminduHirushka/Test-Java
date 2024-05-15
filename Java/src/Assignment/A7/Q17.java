package Assignment.A7;

public class Q17 {
    public static void increment(int x, int[] y) {
        x++;
        y[0]++;
    }

    public static void main(String args[]) {
        int x = 100;
        int[] y = {200};
        System.out.println(x + " " + y[0]);
        increment(x, y);
        System.out.println(x + " " + y[0]);
    }
}
