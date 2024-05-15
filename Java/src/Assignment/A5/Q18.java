package Assignment.A5;

public class Q18 {
    public static void main(String[] args) {
        int x=100;                                  //Line 1
        System.out.println(x);                      //Line 2
        {
            int y=200;                              //Line 3
            System.out.println(x);                  //Line 4
            System.out.println(y);                  //Line 5
            x++;y++;                                //Line 6
        }
        int y=300;                                  //Line 7
        //int x=40;                                 //Line 8 (Error)
        System.out.println(x);                      //Line 9
        System.out.println(y);                      //Line 10
    }
}
