package Assignment.O1_FOP.A5;

public class Q21 {
    public static void main(String[] args) {
        int a = 2;
        char b,c,d;
        b = (a < 2) ? 'f' : 'g';                            // Line 1
        if (a < 2) c = 'h'; else c = 'i';                   // Line 2
        if (a < 2) d = 'j';                                 // Line 3
        if (a > 2) d = 'k';                                 // Line 4
        if (a == 2) d = 'l';                                // Line 5
        //System.out.print(b + "," + c + "," + d);          // Line 6
    }
}
