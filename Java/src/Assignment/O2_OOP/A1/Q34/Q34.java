package Assignment.O2_OOP.A1.Q34;

public class Q34 {
    int a = 10;
    static int b = 20;

    public static void main(String args[]) {
        int c = 20;
        Q34 ob = new Q34();
        // System.out.println(a);                                                        // Illegal
        System.out.println(b);
        System.out.println(c);
        // System.out.println(Q34.a);                                                    // Illegal
        System.out.println(Q34.b);
        // System.out.println(Q34.c);                                                    // Illegal
        System.out.println(ob.a);
        System.out.println(ob.b);
        // System.out.println(ob.c);                                                     // Illegal
    }
}
