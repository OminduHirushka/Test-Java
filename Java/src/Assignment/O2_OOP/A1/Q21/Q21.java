package Assignment.O2_OOP.A1.Q21;

class A {
    int a;

    A(int i) {a = i;}                                   // 100
    // A(int a) {a = a;}                                // 0
    // A(int a) {a = this.a;}                           // 0
    // A(int a) {this.a = a;}                           // 100
    // A(int i) {a = 100;}                              // 100
    // A(int i) {i = a;}                                // 0
    void printValue() {
        System.out.println(a);
    }
}

public class Q21 {
    public static void main(String[] args) {
        A a1 = new A(100);
        a1.printValue();
    }
}
