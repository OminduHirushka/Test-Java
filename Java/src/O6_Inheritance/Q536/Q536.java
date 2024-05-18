package O6_Inheritance.Q536;

class A {
    static {
        System.out.println("Static block A");
    }
}

class B extends A {
    static {
        System.out.println("Static block B");
    }
}

class C extends B {
    static {
        System.out.println("Static block C");
    }
}

class D extends B {
    static {
        System.out.println("Static block D");
    }
}

public class Q536 {
    public static void main(String[] args) {
        new D();
    }
}
