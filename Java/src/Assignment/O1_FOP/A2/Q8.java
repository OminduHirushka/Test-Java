package Assignment.O1_FOP.A2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Inches: ");
        double inch = value.nextDouble();

        double mm = inch * 25.4;

        System.out.print(inch + " inches = "+ mm+ " mm");
    }
}
