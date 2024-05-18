package Assignment.O1_FOP.A4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input First Number: ");
        int num2 = scanner.nextInt();

        if (num1>num2){
            int total;
            total = num1 + num2;
            System.out.println("Total: "+ total);
        } else {
            System.out.println("First Number: "+ num1);
            System.out.println("Second Number: "+ num2);
        }
    }
}
