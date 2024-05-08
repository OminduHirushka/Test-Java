package O2_Arrays.Array;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks = new int[10];

        for (int i = 1; i <= 3; i++) {
            System.out.print("Input Marks of Student "+ i+ " : ");
            marks[i] = input.nextInt();
        }

        System.out.print("[");
        for (int i = 1; i <= 3; i++) {
            System.out.print(marks[i]+ ", ");
        }
        System.out.print("\b\b]");
    }
}
