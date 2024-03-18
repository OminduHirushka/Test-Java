package A4;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);

        System.out.print("Input a Year: ");
        int year1 = year.nextInt();

        int leapYear = year1 % 4;

        if (leapYear!=0) {
            System.out.println("It's not a leap year.");
        } else {
            System.out.println("It's a leap year.");
        }
    }
}
