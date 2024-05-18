package O6_Inheritance.Q542;

class A {
    int a;

    public void printA() {
        System.out.println("a : " + a);
    }
}

class B extends A{
    int b;

    public void printB() {
        System.out.println("b : " + b);
    }
}

public class Q542 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.a = 100;                                     // Legal
        b1.printA();                                    // Legal

        b1.b = 100;
        b1.printB();
    }
}
