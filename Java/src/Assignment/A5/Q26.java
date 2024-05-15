package Assignment.A5;

public class Q26 {
    public static void main(String[] args) {
        int x=1;               // 2 3 1
        // int x=2;            // 3 1
        // int x=3;            // 1
        // int x=4;            // 4
        // int x=0;            // 4
        // int x=5;            // 4

        switch(x){
            default: System.out.print("4 "); break;
            case 1 : System.out.print("2 ");
            case 2 : System.out.print("3 ");
            case 3 : System.out.print("1 "); break;
        }
    }
}
