package Assignment.O2_OOP.A1.Q44;

public class Q44 {
    int x = 10;
    static int y = 20;

    void mA() {
        System.out.println(this.x);
        System.out.println(this.y);
    }

    static void mB() {
        // System.out.println(this.x);                          // Illegal
        // System.out.println(this.y);                          // Illegal
    }
}
