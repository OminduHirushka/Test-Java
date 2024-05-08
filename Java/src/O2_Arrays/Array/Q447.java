package O2_Arrays.Array;

public class Q447 {
    public static int y = 100;

    public static void print(){
        // System.out.println("Local : " + x);      // Illegal, Local variable-> main
        System.out.println("Global : " + y);        // Legal, Global Variable
    }

    public static void main(String[] args) {
        int x = 200;
        print();
    }
}
