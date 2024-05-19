package Assignment.O2_OOP.A1.Q36;

public class Q36 {
    static int m(int i, String s) {
        System.out.print("[" + s + "," + i + "]" + ",");
        return i;
    }

    public static void main(String[] args) {
        int i = 0;
        int a[] = new int[3];
        a[m(i++, "a")] = m(i++, "b");
        System.out.print(a[0] + "," + a[1] + "," + a[2] + "," + i);
    }
}
