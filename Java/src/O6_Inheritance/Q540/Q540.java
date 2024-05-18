package O6_Inheritance.Q540;

class A {
    A(int i) {

    }
}

class B extends A {
    B() {
        // super();                           // Illegal
        super(10);
    }
}

public class Q540 {
    public static void main(String[] args) {
        new B();
    }
}
