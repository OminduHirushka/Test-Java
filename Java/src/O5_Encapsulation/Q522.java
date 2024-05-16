package O5_Encapsulation;

class X1 {
    public void mX() {
        System.out.println("This Is From Class 'X1'.");
    }
}

class Y1 {
    public void mY1() {
        // x.mX1();         Compile time error.
    }
}

public class Q522 {
    public static void main(String[] args) {
        Y1 y = new Y1();
        y.mY1();
    }
}
