package O5_Encapsulation.Option1;

class A {
    public void mA() {
        System.out.println("This Is From Class 'A'.");
    }
}

class B {
    A a1 = new A();

    public void mB() {
        a1.mA();
    }
}

public class Q524 {
    public static void main(String[] args) {
        B b = new B();
        b.mB();
    }
}
