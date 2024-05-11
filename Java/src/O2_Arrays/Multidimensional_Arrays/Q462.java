package O2_Arrays.Multidimensional_Arrays;

import java.util.Scanner;

public class Q462 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks[][] = new int[10][4];

        // read all 4 marks of all 10 students
        for (int i = 0; i < 10; i++) {
            System.out.println("-- Input marks for Student " + (i + 1) + " -- ");
            for (int j = 0; j < 4; j++) {
                System.out.print("Input marks for Subject " + (i + 1) + " : ");
                marks[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }
}
