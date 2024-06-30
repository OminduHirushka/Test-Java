package O17_ObjectReferenceCasting.Q668;

class A { }

class B { }

public class Q668 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        System.out.println(a1 instanceof A);            // Legal
        System.out.println(b1 instanceof B);            // Legal

        // System.out.println(a1 instanceof B);         // Illegal
        // System.out.println(b1 instanceof A);         // Illegal
    }
}
