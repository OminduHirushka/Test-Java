package Assignment.O1_FOP.A5;

public class Q57 {
    public static void main (String args[]) {
        int x=1;
        L1: if(x>0){                            //Line 1
            System.out.print("A ");             //Line 2
            L2: if(x==1) {break L1;}            //Line 3
            System.out.print("B ");             //Line 4
        }
    }
}
