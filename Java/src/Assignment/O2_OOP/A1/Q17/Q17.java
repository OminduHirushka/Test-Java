package Assignment.O2_OOP.A1.Q17;

class MyClass {
    // A (Valid)
    int x;
    int y;

    MyClass(int i, int j) {
        x = i;
        y = j;
    }

    /* B(Valid)
    int x = 100;
    int y = 200;

    MyClass(int i, int j) {

    }
    */

    /* C (Invalid)
    int x;
    int y;

    MyClass(int i, int j) {
        i = x;
        j = y;
    }
    */

    /* D (Valid)
    int x;
    int y;

    MyClass(int i, int j) {
        x = 100;
        y = 200;
    }

    */

    void printValues() {
        System.out.println("Values : " + x + ", " + y);
    }
}

public class Q17 {
    public static void main(String[] args) {
        MyClass c = new MyClass(100, 200);                   // A, B, D outputs "100,200"
        c.printValues();
    }
}
