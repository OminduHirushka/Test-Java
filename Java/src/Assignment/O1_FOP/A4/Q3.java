package Assignment.O1_FOP.A4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Chemistry Marks: ");
        double mark1 = scanner.nextInt();

        System.out.print("Physics Marks: ");
        double mark2 = scanner.nextInt();

        System.out.print("Combined Maths Marks: ");
        double mark3 = scanner.nextInt();

        double total = mark1 + mark2 + mark3;
        System.out.println("\nTotal: "+ total);
        double average = total/3;
        System.out.println("Average: "+ average);

        if (average>75){
            System.out.println("You are PASSED!");
        } else {
            System.out.println("You are Failed!");
        }
    }
}
