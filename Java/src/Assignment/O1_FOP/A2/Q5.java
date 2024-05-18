package Assignment.O1_FOP.A2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("First Number: ");
        int num1 = number.nextInt();

        System.out.print("Second Number: ");
        int num2 = number.nextInt();

        int total = num1 + num2;

        System.out.println("\nTotal = "+ total);
    }
}
