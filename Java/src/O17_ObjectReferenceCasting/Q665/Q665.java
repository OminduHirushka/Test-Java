package O17_ObjectReferenceCasting.Q665;

class A {
    int a;

    public void mA() {
        System.out.println("mA of A");
    }
}

class B extends A {
    int b;

    public void mB() {
        System.out.println("mB of B");
    }
}

public class Q665 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.a = 100;
        a1.mA();

        System.out.println("----------");

        if (a1 instanceof B) {
            B b1 = (B) a1;
            b1.b = 200;
            b1.mB();
        }
        System.out.println("a1 instanceof B : " + (a1 instanceof B));
    }
}
