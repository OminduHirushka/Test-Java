package Assignment.O2_OOP.A1.Q37;

public class Q37 {
    public static int m(int i) {
        System.out.print(i + ", ");
        return i;
    }

    public static void main(String s[]) {
        int i = 0;
        int j = m(++i) + m(++i) * m(++i) % m(++i) + m(++i);
        System.out.print(j % 5);
    }
}
