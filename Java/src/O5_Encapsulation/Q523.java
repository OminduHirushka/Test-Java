package O5_Encapsulation;

class X2 {
    public void mX2() {
        System.out.println("This Is From Class 'X2'.");
    }
}

class Y2 {
    X2 x;

    public void mY2() {
        // x.mX2();         Compile time error.
    }
}

public class Q523 {
    public static void main(String[] args) {
        Y2 y = new Y2();
        y.mY2();
    }
}
