package Assignment.A7;

import java.util.Scanner;

public class Q9 {
    // a
    public static int[] createAnArray(int N) {
        return new int[N];
    }

    // b
    public static void readMarks(int[] marks, Scanner input) {
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Input Marks of Student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }
    }

    // c
    public static int total(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // d
    public static int max(int[] marks) {
        int max = 0;
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;
    }

    // e
    public static int min(int[] marks) {
        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        return min;
    }

    // f
    public static void printMarks(int[] marks) {
        System.out.print("Marks: [");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of Students: ");
        final int N = input.nextInt();

        int[] marks = createAnArray(N);

        readMarks(marks, input);

        int total = total(marks);

        int max = max(marks);

        int min = min(marks);

        printMarks(marks);

        System.out.println("Total Marks: " + total);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
