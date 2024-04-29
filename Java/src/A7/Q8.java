package A7;

import java.util.Scanner;

public class Q8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of Students: ");
        final int N = input.nextInt();

        // a
        int[] marks = new int[N];

        // b
        for (int i = 0; i < N; i++) {
            System.out.print("Input Marks of Student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        // c
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        // d
        int max = 0;
        for (int i = 1; i < N; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }

        // e
        int min = marks[0];
        for (int i = 1; i < N; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }

        // f
        System.out.print("Marks: [");
        for (int i = 0; i < N - 1; i++) {
            System.out.print(marks[i] + ", ");
        }
        System.out.println(marks[N - 1] + "]");

        System.out.println("Total: " + total);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
