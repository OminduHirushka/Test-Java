package Assignment.O1_FOP.A5;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i=0; i<50; i++){
            System.out.print("Input Number: ");
            int number = scanner.nextInt();

            if (number>100){
                count++;
            }
        }
        System.out.println(count+ " of inputs are greater than 100.");
    }
}
