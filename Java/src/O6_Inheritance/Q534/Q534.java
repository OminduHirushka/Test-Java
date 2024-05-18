package O6_Inheritance.Q534;

class A {
    int a;

    public void printA() {
        System.out.println("a: " + a);
    }
}

class B extends A {
    int b;

    public void printB() {
        System.out.println("b: " + b);
    }

    public void printAB() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public void callPrint(){
        printA();
        printB();
    }
}

public class Q534 {
    public static void main(String[] args) {
        B b = new B();
        b.callPrint();
        b.printB();
        b.printAB();
    }
}
