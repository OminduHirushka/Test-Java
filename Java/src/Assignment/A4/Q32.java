package Assignment.A4;

public class Q32 {
    public static void main(String[] args) {
        int x=1;               // 1 2 3
        // int x=2;            // 2 3
        // int x=3;            // 3
        // int x=4;            // 4 1 2 3
        // int x=0;            // 4 1 2 3
        // int x=5;            // 4 1 2 3

        switch(x){
            default: System.out.print("4 ");
            case 1 : System.out.print("1 ");
            case 2 : System.out.print("2 ");
            case 3 : System.out.print("3 ");
        }

    }
}
