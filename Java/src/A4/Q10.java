package A4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        if (num%2 != 0){
            System.out.println(num+ " is an odd number.");
        } else {
            System.out.println(num+ " is an even number.");
        }
    }
}
