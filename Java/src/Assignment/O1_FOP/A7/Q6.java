package Assignment.O1_FOP.A7;

import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        // a
        int[] ar = new int[12];

        // b
        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(101);
        }

        // c
        System.out.print("[");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b]");

        // d
        System.out.print("[");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b]");

        // e
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);

        // f
        int max = 0;
        for (int num : ar) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);

        // g
        int min = ar[0];
        for (int num : ar) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum value: " + min);

        // h
        int numOfEven = 0;
        for (int num : ar) {
            if (num % 2 == 0) {
                numOfEven++;
            }
        }
        System.out.println("Number of Even numbers: " + numOfEven);

        // i
        int numOfOdd = 0;
        for (int num : ar) {
            if (num % 2 != 0) {
                numOfOdd++;
            }
        }
        System.out.println("Number of Even numbers: " + numOfOdd);
        //  int numOfOdd = ar.length - numOfEven;
        //  System.out.println("Number of Odd Numbers: " + numOfOdd);

        // j
        System.out.print("[");
        for (int i = 0; i < ar.length; i = i + 2) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b]");

        // k
        System.out.print("[");
        for (int i = 1; i < ar.length; i = i + 2) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
