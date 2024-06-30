package O17_ObjectReferenceCasting.Q667;

class A { }

class B { }

public class Q667 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        // a1 = (A) b1;                // Illegal ( not in the same class hierarchy )
        // b1 = (B) a1;                // Illegal ( not in the same class hierarchy )
    }
}
