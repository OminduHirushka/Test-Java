package A5;

public class Q22 {
    public static void main(String[] args) {
        int a=-5;
        int b=-2;
        a%=b;
        a/=b;
        b=a>0?0:a;
        System.out.println(a+" "+b);
    }
}
