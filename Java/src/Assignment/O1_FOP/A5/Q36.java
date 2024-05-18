package Assignment.O1_FOP.A5;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number!=0){
            sum = sum + number%10;              // sum += number%10
            number = number/10;                 // number /= 10
        }

        System.out.println("Sum of Digits = "+ sum);
    }
}
