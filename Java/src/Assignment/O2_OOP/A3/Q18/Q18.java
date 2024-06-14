package Assignment.O2_OOP.A3.Q18;

class A {
    public void myMethod(int a) {
        System.out.println("myMethod of A");
    }
}

class B extends A {
    public void myMethod(int a) {
        System.out.println("myMethod of B");
    }
}

class C extends B {
    public void myMethod(int a) {
        System.out.println("myMethod of C");
    }
}

public class Q18 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        A a3 = new C();
        B b1 = new B();
        B b2 = new C();
        C c1 = new C();

        a1.myMethod(100);
        a2.myMethod(100);                // ( dynamic method dispatch” )
        a3.myMethod(100);                // ( dynamic method dispatch” )
        b1.myMethod(100);
        b2.myMethod(100);                // ( dynamic method dispatch” )
        c1.myMethod(100);
    }
}
