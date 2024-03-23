package A4;

public class Q33 {
    public static void main(String[] args) {

        char x = 'A';                       // Output --> 65
        // int x = 65;                      // Output --> 65
        // int x = 65536;                   // Output --> wrong
        // byte x = 65;                     // Output --> 65
        // short x = 66;                    // Output --> 66
        // boolean x = true;                // Output --> Error
        // String x = "A";                  // Output --> Error
        // double x = 65.0;                 // Output --> Error

        switch(x){
            case 'A' : System.out.println("65 ");break;
            case 'B' : System.out.println("66 ");break;
            case 'C' : System.out.println("67 ");break;
            default : System.out.println("wrong ");
        }
    }
}
