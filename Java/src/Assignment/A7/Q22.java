package Assignment.A7;

import java.util.Scanner;

public class Q22 {
    private static boolean isDuplicate(int[] array, int count, int number) {
        for (int i = 0; i < count; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    private static void inputNumbers(int[] array, int count) {
        System.out.print("Input Numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input five numbers between 10 and 100: ");

        while (count < 5) {
            int number = scanner.nextInt();

            if (number < 10 || number > 100) {
                System.out.println("Number must be between 10 and 100.");
                continue;
            }

            if (!isDuplicate(numbers, count, number)) {
                numbers[count] = number;
                count++;
                inputNumbers(numbers, count);
            } else {
                System.out.println("Duplicate number.");
            }
        }

        System.out.print("Unique Values: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
