package O17_ObjectReferenceCasting.Q661;

class A {
    int a;

    public void mA() {
        System.out.println(a);
        System.out.println("mA of A");
    }
}

class B extends A {
    int b;

    public void mB() {
        System.out.println("mB of B");
    }
}

public class Q661 {
    public static void main(String[] args) {
        A a1 = new B();
        a1.a = 100;                            // Legal
        a1.mA();                               // Legal

        System.out.println("------------");

        // a1.b = 200;                         // Illegal
        // a1.mB();                            // Illegal

        System.out.println("------------");

        B b1 = new B();
        b1.a = 200;                            // Legal
        b1.mA();                               // Legal
        b1.mB();                               // Legal
    }
}
