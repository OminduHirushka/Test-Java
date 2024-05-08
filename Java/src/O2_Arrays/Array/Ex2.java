package O2_Arrays.Array;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random input = new Random();

        int[] marks = new int[10];

        for (int i = 1; i <= 3; i++) {
            marks[i] = input.nextInt(100);
        }

        System.out.print("[");
        for (int i = 1; i <= 3; i++) {
            System.out.print(marks[i] + ", ");
        }
        System.out.println("\b\b]");

        // Total
        int total = 0;
        for (int i = 1; i <= 3; i++) {
            total += marks[i];
        }
        System.out.println("Total = "+ total);
    }
}
