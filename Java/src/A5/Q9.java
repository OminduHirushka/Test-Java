package A5;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number: ");
        int num = scanner.nextInt();

        int fact = 1;

        for (int i=1; i<=num; i++){
            fact = fact * i;
        }

        System.out.println(num+"! = "+ fact);
    }
}
