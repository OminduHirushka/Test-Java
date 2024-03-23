package A4;

public class Q11 {
    public static void main(String[] args) {
        int x = 10;

        // if (x){}                           // Error

        // if (x=10){}                        // Error

        // if (x==10){}                       // Legal

        // if (x=100!=10){}                   // Error

        // if ((x=100)!=10){}                 // Legal

        // if ((x=100)>0==true){}             // Legal (syntactically valid)
    }
}
