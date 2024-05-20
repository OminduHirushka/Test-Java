package Assignment.O2_OOP.A1.Q56;

public class Q56 {
    public static void myMethod(int y, double x) {
        System.out.println("myMethod(int,double)");
    }

    public static void myMethod(double x, int y) {
        System.out.println("myMethod(double,int)");
    }

    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int x = 30;
        long y = 10;
        float f = 1.0f;
        double d = 1.2;
        char ch = 'A';

        // myMethod(b, b);                                      // Illegal
        // myMethod(s, s);                                      // Illegal
        // myMethod(b, s);                                      // Illegal
        // myMethod(s, b);                                      // Illegal
        // myMethod(x, x);                                      // Illegal
        myMethod(x, y);
        myMethod(y, x);
        // myMethod(x, b);                                      // Illegal
        // myMethod(y, y);                                      // Illegal
        myMethod(x, f);
        myMethod(x, d);
        // myMethod(ch, ch);                                    // Illegal
        // myMethod(x, ch);                                     // Illegal
        myMethod(ch, d);
    }
}
