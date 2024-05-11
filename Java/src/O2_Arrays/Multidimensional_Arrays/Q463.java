package O2_Arrays.Multidimensional_Arrays;

import java.util.Random;

public class Q463 {
    public static void main(String[] args) {
        Random input = new Random();
        int marks[][] = new int[10][4];

        // read random 4 marks of all 10 students
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                marks[i][j] = input.nextInt(101);
            }
        }
    }
}
