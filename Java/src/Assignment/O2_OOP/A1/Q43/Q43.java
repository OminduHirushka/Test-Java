package Assignment.O2_OOP.A1.Q43;

class MyClass {
    int x = 10;
    static int y = 20;

    MyClass() {
        System.out.print("3 ");
    }

    static {
        System.out.print("1 ");
    }

    {
        System.out.print("2 ");
    }

    static void mB() {
        System.out.print("4 ");
    }
}

public class Q43 {
    public static void main(String[] args) {
        new MyClass();
        // MyClass.mB();
        // new MyClass().mA();                              // Illegal
        // MyClass c1;
    }
}
