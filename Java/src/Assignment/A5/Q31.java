package Assignment.A5;

public class Q31 {
    public static void main(String[] args) {
        //char x=’A’;                                   // Illegal
        int x=65;                                       // Legal
        // int x=65536;                                 // Legal
        // byte x=65;                                   // Legal
        // short x=66 ;                                 // Legal
        // boolean x =true;                             // Illegal
        // String x=”A”;                                // Illegal
        // double x=65.0;                               // Illegal

        switch(x){
            case 'A' : System.out.println("65 ");break;
            case 'B' : System.out.println("66 ");break;
            case 'C' : System.out.println("67 ");break;
            default : System.out.println("wrong ");
        }
    }
}
