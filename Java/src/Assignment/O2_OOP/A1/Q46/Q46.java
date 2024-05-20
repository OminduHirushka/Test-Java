package Assignment.O2_OOP.A1.Q46;

public class Q46 {
    public static void myMethod(int y, double x) {
        System.out.println("myMethod(int,double)");
    }

    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int x = 30;
        long y = 10;
        float f = 1.0f;
        double d = 1.2;
        char ch = 'A';

        myMethod(b, b);
        myMethod(s, s);
        myMethod(b, s);
        myMethod(s, b);
        myMethod(x, x);
        myMethod(x, y);
        // myMethod(y, x);
        myMethod(x, b);
        // myMethod(y, y);
        myMethod(x, f);
        myMethod(x, d);
        myMethod(ch, ch);
        myMethod(x, ch);
        myMethod(ch, d);
    }
}
