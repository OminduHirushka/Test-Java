package O2_Arrays.Multidimensional_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Q464 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input No of Student : ");
        final int N = scanner.nextInt();

        System.out.print("Input No of Subject : ");
        final int S = scanner.nextInt();

        Random input = new Random();
        int marks[][] = new int[N][S];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < S; j++) {
                marks[i][j] = input.nextInt(101);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < S; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
