package A4;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input your Second Number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input your Third Number: ");
        int num3 = scanner.nextInt();

        int max;

        if (num1>num2 && num1>num3){
            max = num1;
        } else if (num2>num1 && num2>num3){
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("Maximum Number Is: "+ max);
    }
}
