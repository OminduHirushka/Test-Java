package A4;

public class Q13 {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(x=9);

        System.out.println(x==9);                       // When consider as a separate code, Output --> false

        // System.out.println(x=9!=10);                 // Syntax Error

        System.out.println((x=9)==10);

        System.out.println((x=9)<=10);

    }
}

