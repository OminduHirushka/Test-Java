package Assignment.O2_OOP.A1.Q48;

public class Q48 {
    void myMethod() {
        int x, y;
        x = 5;
        y = 3;
        System.out.print( " ( " + x + ", " + y + " ) " );
        switchCoords( x, y );
        System.out.print( " ( " + x + ", " + y + " ) " );
    }
    void switchCoords( int x, int y ) {
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.print( " ( " + x + ", " + y + " ) " );
    }

    public static void main(String[] args) {
        Q48 meth = new Q48();
        meth.myMethod();
    }
}
