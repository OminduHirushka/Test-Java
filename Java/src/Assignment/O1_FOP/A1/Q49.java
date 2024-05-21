package Assignment.O1_FOP.A1;

import java.util.*;

class Q49 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num = input.nextInt();
        int fact = 1;
        for (int i = num; i > 0; i--) {
            System.out.print(i + " * ");
            fact *= i;
        }
        System.out.println("\b\b = " + fact);
    }
}
