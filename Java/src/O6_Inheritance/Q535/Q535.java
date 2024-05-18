package O6_Inheritance.Q535;

class A {
    int a;

    public void printA() {
        System.out.println("a : " + a);
    }

    static {
        System.out.println("Static block A");
    }
}

class B extends A {
    int b;

    public void printB() {
        System.out.println("b : " + b);
    }

    public void printAB() {
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    static {
        System.out.println("Static block B");
    }
}

public class Q535 {
    public static void main(String[] args) {
        new B();
    }
}
