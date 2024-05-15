package Assignment.A4;

public class Q23 {
    public static void main(String[] args) {
        int x=100;
        System.out.println(x);                  //Line 1

        {
            int y=200;
            {
                int z=300;
                System.out.println(x);          //Line 2
                System.out.println(y);          //Line 3
                System.out.println(z);          //Line 4
            }

            System.out.println(x);              //Line 5
            System.out.println(y);              //Line 6
            // System.out.println(z);           //Line 7 (Error)
        }

        System.out.println(x);                  //Line 8
        // System.out.println(y);               //Line 9 (Error)
        // System.out.println(z);               //Line 10 (Error)
    }
}
