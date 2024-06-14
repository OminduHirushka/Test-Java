package Assignment.O2_OOP.A3.Q31;

class A {
    void m(A a) {
        System.out.print("A");
    }
}

class B extends A {
    void m(B b) {
        System.out.print("B");
    }
}

class C extends B {
    void m(C c) {
        System.out.print("C");
    }
}

public class Q31 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        c.m(a);
        c.m(b);
        c.m(c);
    }
}
