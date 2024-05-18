package Assignment.O2_OOP.A1.Q18;

class A {
    int a;

    A(int i) {
        a = i;
    }
}

public class Q18 {
    public static void main(String[] args) {
        A a1 = new A(100);
        A a2 = new A(101);
        System.out.println(a1.a + " " + a2.a);
        a1 = a2;
        a1.a = 0;
        System.out.println(a1.a + " " + a2.a);
    }
}
