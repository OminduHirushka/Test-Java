package A4;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Year: ");
        int year = scanner.nextInt();

        int leapYear = year % 4;
        if (leapYear!=0) {
            System.out.println("It's not a leap year.");
        } else {
            System.out.println("It's a leap year.");
        }
    }
}
