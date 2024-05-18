package Assignment.O1_FOP.A4;

public class Q30 {
    public static void main(String[] args) {
        boolean b = false;

        System.out.println(10>4 && true !=b==(10+3/2==8)==true);                     // Output --> false
        System.out.println(b=false==true||true!=(b=false));                          // Output --> true
        // System.out.println((b=false)=true? 4 :5==5 & true==3*2<=29);              // Output --> Syntax Error
        System.out.print (('a' == 'a')+" ");                                         // Output --> true
        System.out.print(('a' == 'b')+" ");                                          // Output --> false
        System.out.print((5 != 6)+" ");                                              // Output --> true
        System.out.print((5.0 == 5L)+" ");                                           // Output --> true
        System.out.println((true == false));                                         // Output --> false
    }
}

