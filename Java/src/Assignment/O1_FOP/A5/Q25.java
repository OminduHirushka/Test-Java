package Assignment.O1_FOP.A5;

public class Q25 {
    public static void main(String[] args) {
        final int x=100;
        final int y;
        y=100;
        int z=100;
        int a;

        if(x>0){a=0;}                          // Output --> 0

        // a=0;                                // Output --> 0

        // if(y>0){a=0;}                       // Output --> (variable a might not have been initialized)

        // if(z>0){a=0;}                       // Output --> (variable a might not have been initialized)

        // if(true){a=0;}                      // Output --> 0

        // if(y>0){a=0;}else {a=-1;}           // Output --> 0

        // a=z>0?0:-1;                         // Output --> 0

        System.out.println(a);
    }
}
