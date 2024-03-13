package A3;

public class Q29 {
    public static void main(String[] args) {
        int a = 100, b = 100, c = 100, d = 100;

        a = a + (a = 6);
        System.out.println(a);

        b = (b = 6) + b;
        System.out.println(b);

        c = (c = 6) + (c = 5);
        System.out.println(c);

        d = d * 3 + d;
        System.out.println(d);
    }
}
