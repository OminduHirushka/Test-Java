package Assignment.O2_OOP.A3.Q25;

class A {
    static {
        System.out.print("A ");
    }
}

class B extends A {
    static {
        System.out.print("B ");
    }
}

class C extends B {
    static {
        System.out.print("C ");
    }
}

class D extends B {
    static {
        System.out.print("D ");
    }
}

class E extends C {
    static {
        System.out.print("E ");
    }
}

public class Q25 {
    public static void main(String[] args) {
        new D();
        new E();
    }
}
