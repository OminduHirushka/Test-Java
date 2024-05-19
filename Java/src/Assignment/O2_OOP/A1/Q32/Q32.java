package Assignment.O2_OOP.A1.Q32;

public class Q32 {
    int x = 10;
    static int y = 20;

    static void staticMethod() {
    }

    void instanceMethod() {
    }

    void mA() {
        System.out.println(x);
        System.out.println(y);
        staticMethod();
        instanceMethod();
    }

    static void mB() {
        // System.out.println(x);                                              // Illegal
        System.out.println(y);
        staticMethod();
        // instanceMethod();                                                   // Illegal
    }
}
