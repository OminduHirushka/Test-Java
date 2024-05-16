package O5_Encapsulation.Option2;

class A {
    public void mA() {
        System.out.println("This Is From Class 'A'.");
    }
}

class B {
    A a1;

    B(A a1) {
        this.a1 = a1;
    }

    public void mB() {
        a1.mA();
    }
}

public class Q525 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        b.mB();
    }
}
