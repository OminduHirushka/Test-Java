package O17_ObjectReferenceCasting.Q670;

final class A { }

interface B { }

public class Q670 {
    public static void main(String[] args) {
        A a1 = null;
        B b1 = null;

        // a1 = (A) b1;                                 // Illegal
        // b1 = (B) a1;                                 // Illegal

        System.out.println(a1 instanceof A);            // Legal
        System.out.println(b1 instanceof B);            // Legal

        // System.out.println(a1 instanceof B);         // Illegal
        // System.out.println(b1 instanceof A);         // Illegal
    }
}
