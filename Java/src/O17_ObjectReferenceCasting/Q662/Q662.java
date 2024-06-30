package O17_ObjectReferenceCasting.Q662;

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

public class Q662 {
    public static void main(String[] args) {
        A a1 = new B();
        a1.a = 100;                            // Legal
        a1.mA();                               // Legal

        System.out.println("------------");

        // B b1 = a1;                          // Illegal
        // b1.mB();
        // b1.b = 200;
    }
}
