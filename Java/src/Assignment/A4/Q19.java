package Assignment.A4;

public class Q19 {
    public static void main(String[] args) {
        int x = 100, y = 99;

        if(x==y) {
            System.out.println("Success");
        }else{
            System.out.println("Failed");                           // Failed
        }

        if(x++==++y) {
            System.out.println("Success");
        }else{
            System.out.println("Failed");                           // Success
        }

        if(x++==y++) {
            System.out.println("Success");
        }else{
            System.out.println("Failed");                           // Failed
        }

        if(++x==y++) {
            System.out.println("Success");
        }else{
            System.out.println("Failed");                           // Failed
        }
    }
}
