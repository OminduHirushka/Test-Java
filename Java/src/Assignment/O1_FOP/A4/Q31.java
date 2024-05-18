package Assignment.O1_FOP.A4;

public class Q31 {
    public static void main(String[] args) {
        boolean b1, b2, b3;

        b1 = true != false;                                                      // Output --> nothing
        b2 = 5%3 == 2 ^ true == !false ;                                         // Output --> nothing
        System.out.println((b3 =true) & b2 || b1 == false);                      // Output --> false
        System.out.println(b3 = b2 == b1);                                       // Output --> false
        b3= true;                                                                // Output --> nothing
        System.out.println(b3^b2&b1|false != (b3 = false));                      // Output --> true
        System.out.println(!b3==b2 && b2 != b1 ||!b1 != b2);                     // Output --> false
    }
}
