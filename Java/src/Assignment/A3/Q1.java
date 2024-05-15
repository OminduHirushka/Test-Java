package Assignment.A3;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num1, num2,total;

        System.out.print("Input First Number: ");
        num1 = number.nextInt();

        System.out.print("Input Second Number: ");
        num2 = number.nextInt();

        total = num1 + num2;
        System.out.println("Total = "+ total);
    }
}
