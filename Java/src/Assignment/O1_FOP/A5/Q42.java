package Assignment.O1_FOP.A5;

import java.util.Scanner;

public class Q42 {
    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;

        while (temp != 0) {
            rev *= 10;
            rev += (temp % 10);
            temp /= 10;

        }
        return rev == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number+ " is a palindrome number.");
        } else {
            System.out.println(number+ " is not a palindrome number.");
        }
    }
}

