package A7;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // a
        int[] ar = new int[5];

        // b
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Numbers: ");
        ar[0] = scanner.nextInt();
        ar[1] = scanner.nextInt();
        ar[2] = scanner.nextInt();
        ar[3] = scanner.nextInt();
        ar[4] = scanner.nextInt();

        // c
        System.out.println("Input Numbers: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }

        // d
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
        System.out.println(ar[3]);
        System.out.println(ar[4]);

        // e
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
