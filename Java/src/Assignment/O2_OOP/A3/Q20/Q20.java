package Assignment.O2_OOP.A3.Q20;

class Super {
    int a = 10;
    static int x = 100;

    Super() {
        System.out.println("Super()");
    }

    Super(int i) {
        System.out.println("Super(int)");
    }
}

class Sub extends Super {
    int b = 20;
    static int y = 200;

    Sub(int i) {
        // super(a);                    // Illegal
        // super(b);                    // Illegal
        // super(x);
        // super(y);
        // super(i);
        // super(100);

        System.out.println("Sub(int)");
    }
}

public class Q20 {
    public static void main(String[] args) {

    }
}
