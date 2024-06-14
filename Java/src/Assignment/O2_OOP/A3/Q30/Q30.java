package Assignment.O2_OOP.A3.Q30;

class Base {
    public Base(int i) {

    }
}

public class Q30 extends Base {
    Q30(int i) {
        super(i);
    }

    Q30(String s, int i) {
        this(i);

        // Q30 q = new Q30();                               // Illegal
        // super();                                         // Illegal
        // this("Hello", 10);                               //
        Base b = new Base(10);
    }

    public static void main(String[] args) {
        Q30 q = new Q30(10);
    }
}
