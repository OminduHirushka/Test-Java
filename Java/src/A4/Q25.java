package A4;

public class Q25 {
    public static void main(String[] args) {
        int a = 2;
        char b,c,d;

        b = (a < 2) ? 'f' : 'g';

        if (a < 2) c = 'h'; else c = 'i';

        if (a < 2) d = 'j';

        if (a > 2) d = 'k';

        if (a == 2) d = 'l';

        // System.out.print(b + "," + c + "," + d);             // Error (Variable d might not have been initialized)
    }
}

