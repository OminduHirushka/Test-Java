package O2_Arrays.Multidimensional_Arrays;

import java.util.Scanner;

public class Q461 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks[][] = new int[10][4];

        // read student 1 marks
        System.out.println("-- Input marks for Student 1 -- ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Input marks for Subject " + (i + 1) + " : ");
            marks[0][i] = input.nextInt();
        }

        // read student 2 marks
        System.out.println();
        System.out.println("-- Input marks for Student 2 -- ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Input marks for Subject " + (i + 1) + " : ");
            marks[2][i] = input.nextInt();
        }

        // read student 3 marks
        System.out.println();
        System.out.println("-- Input marks for Student 3 -- ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Input marks for Subject " + (i + 1) + " : ");
            marks[3][i] = input.nextInt();
        }

        // read student 4 marks
        System.out.println();
        System.out.println("-- Input marks for Student 4 -- ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Input marks for Subject " + (i + 1) + " : ");
            marks[4][i] = input.nextInt();
        }
    }
}
