package Assignment.O2_OOP.A3.Q10;

class A {
    int a;

    void printA() {
        System.out.println("a : " + a);
    }
}

class B {
    int b;

    void printB() {
        System.out.println("b : " + b);                     //Line 1
    }

    void callPrintAB() {
        // printA();                                        //Line 2 ( Error )
        printB();                                           //Line 3
    }

    void printAB() {
        // System.out.println("a : " + a);                  //Line 4 ( Error)
        System.out.println("b : " + b);                     //Line 5
    }
}

public class Q10 {
}
