package O17_ObjectReferenceCasting.Q666;

class A { }

class B extends A { }

class C extends B { }

public class Q666 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        A a3 = new C();

        B b1 = new B();
        B b2 = new C();

        C c1 = new C();

        System.out.println("a1 instanceof A : " + (a1 instanceof A));       // true
        System.out.println("a1 instanceof B : " + (a1 instanceof B));       // false
        System.out.println("a1 instanceof C : " + (a1 instanceof C));       // false

        System.out.println("a2 instanceof A : " + (a2 instanceof A));       // true
        System.out.println("a2 instanceof B : " + (a2 instanceof B));       // true
        System.out.println("a2 instanceof C : " + (a2 instanceof C));       // false

        System.out.println("a3 instanceof A : " + (a3 instanceof A));       // true
        System.out.println("a3 instanceof B : " + (a3 instanceof B));       // true
        System.out.println("a3 instanceof C : " + (a3 instanceof C));       // true

        System.out.println("b1 instanceof A : " + (b1 instanceof A));       // true
        System.out.println("b1 instanceof B : " + (b1 instanceof B));       // true
        System.out.println("b1 instanceof C : " + (b1 instanceof C));       // false

        System.out.println("b2 instanceof A : " + (b2 instanceof A));       // true
        System.out.println("b2 instanceof B : " + (b2 instanceof B));       // true
        System.out.println("b2 instanceof C : " + (b2 instanceof C));       // true

        System.out.println("c1 instanceof A : " + (c1 instanceof A));       // true
        System.out.println("c1 instanceof B : " + (c1 instanceof B));       // true
        System.out.println("c1 instanceof C : " + (c1 instanceof C));       // true
    }
}
