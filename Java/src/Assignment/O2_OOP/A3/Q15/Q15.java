package Assignment.O2_OOP.A3.Q15;

class A { }

class B extends A { }

class C extends A { }

class D extends B { }

public class Q15 {
    public static void main(String[] args) {
        A a1 = new A();                     //Line 1
        B b1 = new B();                     //Line 2
        C c1 = new C();                     //Line 3
        D d1 = new D();                     //Line 4

        A a2 = a1;                          //Line 5

        a2 = b1;                            //Line 6

        a2 = c1;                            //Line 7

        a2 = d1;                            //Line 8

        // B b2 = a1;                       //Line 9   ( Illegal )

        // b2 = c1;                         //Line 10  ( Illegal )

        // b2 = d1;                         //Line 11

        // C c2 = a1;                       //Line 12  ( Illegal )

        // c2 = b1;                         //Line 13  ( Illegal )

        // c2 = d1;                         //Line 14  ( Illegal )

        // D d2 = a1;                       //Line 15  ( Illegal )

        // d2 = b1;                         //Line 16  ( Illegal )

        // d2 = c1;                         //Line 17  ( Illegal )
    }
}
