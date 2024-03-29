package A5;

import java.util.Scanner;

public class Q39 {
    public static int GDC(int x, int y){
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result = GDC(num1, num2);
        System.out.println("The GDC of " + num1 + " and " + num2 + " is: " + result);
    }
}
