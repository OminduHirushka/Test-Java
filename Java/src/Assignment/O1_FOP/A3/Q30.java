package Assignment.O1_FOP.A3;

public class Q30 {
    public static void main(String[] args) {
        int x, y;
        x = y = 100;

        x = x++ + x++ + x++ ;
        System.out.println(x);

        y = ++y + ++y + ++y;
        System.out.println(y);

        y = x = 100;
        System.out.println();
        x = x++ + ++y + ++x + y++;
        System.out.println(x+ " "+ y);
    }
}
