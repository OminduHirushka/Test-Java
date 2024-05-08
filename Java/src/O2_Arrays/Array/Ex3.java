package O2_Arrays.Array;

import java.util.Random;

public class Ex3 {
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

        // Maximum Value
        int max = 0;
        for (int i = 1; i <= 3; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }
        }
        System.out.println("Maximum Value: "+ max);

        // Minimum Value
        int min = marks[1];
        for (int i = 1; i <= 3; i++) {
            if (min > marks[i]) {
                min = marks[i];
            }
        }
        System.out.println("Minimum Value: "+ min);
    }
}
