package Assignment.O1_FOP.A5;

public class Q28 {
    public static void main(String[] args) {
        int a=1;
        final int b=2;
        final int c;
        c=3;
        final char d='A';
        final char e='B';
        int x=1;

        switch(x){
            case 65: System.out.print("65");
            // case a:                          // Illegal
            case b:                             // Legal
            // case c:                          // Illegal
            case e:                             // Legal
            // case f:                          // Illegal
            // case ‘A’:                        // Illegal
            // case 1.0:                        // Illegal
            // case (char)66:                   // Illegal
        }
    }
}
