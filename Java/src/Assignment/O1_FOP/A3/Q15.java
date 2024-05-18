package Assignment.O1_FOP.A3;

public class Q15 {
    public static void main(String[] args) {
        int x, y, z;
        byte b, a, c;
        x=Short.MAX_VALUE;
        // x=Short.MIN_VALUE;             // 0
        y=-1;
        // x=Byte.MAX_VALUE;              // 127
        // x=Byte.MIN_VALUE;              // -128
        // x=0;                           // 0
        z=Integer.MAX_VALUE;
        // x=Integer.MIN_VALUE;           // 0

        b=(byte)x;
        System.out.println(b);
        a=(byte)y;
        System.out.println(a);
        c=(byte)z;
        System.out.println(c);
    }
}
