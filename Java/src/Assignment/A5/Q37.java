package Assignment.A5;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int number = scanner.nextInt();

        while (number!=0){
            int reverse = number%10;
            System.out.print(" "+reverse);
            number = number/10;
        }
    }
}
