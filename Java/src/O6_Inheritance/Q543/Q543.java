package O6_Inheritance.Q543;

class A {
    int a;

    public void printA() {
        System.out.println("a : " + a);
    }
}

class B extends A {
    int b;

    public void printB() {
        System.out.println("b : " + b);
    }
}

public class Q543 {
    public static void main(String[] args) {
        A a1 = new B();                             // Legal -> B extends A
        a1.a = 300;                                 // Legal
        a1.printA();

        // a1.b = 400;                             // Illegal
        // a1.printB();                            // Illegal
    }
}
