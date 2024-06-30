package O17_ObjectReferenceCasting.Q669;

class A { }

interface B { }

public class Q669 {
    public static void main(String[] args) {
        A a1 = null;
        B b1 = null;

        a1 = (A) b1;                                // Legal
        b1 = (B) a1;                                // Legal

        System.out.println(a1 instanceof A);        // Legal
        System.out.println(b1 instanceof B);        // Legal

        System.out.println(a1 instanceof B);        // Legal
        System.out.println(b1 instanceof A);        // Legal
    }
}
