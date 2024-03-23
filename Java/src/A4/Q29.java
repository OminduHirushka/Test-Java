package A4;

public class Q29 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        int x;

        x = a++ + b++ + c++ + d++;
        System.out.println(a+ " "+ b+ " "+ c+ " "+ d+ " "+ x);
        x += a += b += c += d;
        System.out.println(a+ " "+ b+ " "+ c+ " "+ d+ " "+ x);
        x = a = b = c = d;
        System.out.println(a+ " "+ b+ " "+ c+ " "+ d+ " "+ x);
    }
}
