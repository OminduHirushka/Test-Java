package O2_Arrays.Array;

public class Q446 {
    public static int x = 100;

    public static void main(String[] args) {
        int x = 200;
        System.out.println("Local : " + x);
        System.out.println("Global : " + Q446.x);
    }
}
