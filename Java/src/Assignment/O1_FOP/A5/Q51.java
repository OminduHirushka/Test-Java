package Assignment.O1_FOP.A5;

public class Q51 {
    public static void main(String[] args) {
        boolean b = false;
        int i = 1;

        do {
            i++;
            b =! b;
        } while (b);
        System.out.println(i);
    }
}
