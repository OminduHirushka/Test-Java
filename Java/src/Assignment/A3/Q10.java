package Assignment.A3;

public class Q10 {
    public static void main(String[] args) {
        double d = 'A';
        long l = (int)d;

        char ch = 'A';
        double db = ch;

        /* byte b = ’65’;                   //Error
        char ch = b; */

        /* double d = ’A’;                  //Error
        char ch = (short)d; */

        float f = 65;
        int x = (char)f;
    }
}
