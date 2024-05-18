package Assignment.O1_FOP.A3;

public class Q28 {
    public static void main(String[] args) {
        int x;

        x= 7 % 10 / 2 * 2;
        System.out.println(x);

        x= 7 % (10 / 2) * 2;
        System.out.println(x);

        x= 7 % 10 / (2 * 2);
        System.out.println(x);

        x= 7 % (10 / (2 * 2));
        System.out.println(x);

        x= 7 % ((10 / 2) * 2);
        System.out.println(x);
    }
}
