package O5_Encapsulation.Option3;

class A {
    public void mA() {
        System.out.println("This Is From Class 'A'.");
    }
}

class B {
    A a1;

    public void mB() {
        a1.mA();
    }

    public void setA(A a1) {
        this.a1 = a1;
    }
}

public class Q526 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.setA(a);
        b.mB();
    }
}
