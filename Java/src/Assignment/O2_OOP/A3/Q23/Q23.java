package Assignment.O2_OOP.A3.Q23;

public class Q23 {
    Q23() {}

    Q23(Q23 q) {
        q1 = q;
    }

    Q23 q1;

    public static void main(String[] args) {
        Q23 q2 = new Q23();

        Q23 q3 = new Q23(q2);
        q3.go();

        Q23 q4 = q3.q1;
        q4.go();

        Q23 q5 = q2.q1;
        q5.go();
    }

    void go() {
        System.out.print("hi ");
    }
}
