package O5_Encapsulation.Option4;

class A {
    public void mA() {
        System.out.println("This Is From Class 'A'.");
    }
}

class B {
    public void mB(A a1) {
        a1.mA();
    }
}

public class Q527 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.mB(a);
    }
}
