package O17_ObjectReferenceCasting.Q663;

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

public class Q663 {
    public static void main(String[] args) {
        A a1 = new B();
        a1.a = 100;                            // Legal
        a1.mA();                               // Legal

        System.out.println("------------");

        B b1 = (B) a1;                          // Legal ( object reference Casting )
        b1.mB();
        b1.b = 200;
    }
}