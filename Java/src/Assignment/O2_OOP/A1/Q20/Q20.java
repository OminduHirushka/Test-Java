package Assignment.O2_OOP.A1.Q20;

class A {
    int a;

    /*  A (Invalid)
    A(int i) {
        a = i;
    }
    */

    /*  B (Valid)
    void A(int i) {
        a = i;
    }
    */

    //  C (Valid)
    A() {

    }

}

public class Q20 {
    public static void main(String[] args) {
        A a2 = new A();
    }
}
