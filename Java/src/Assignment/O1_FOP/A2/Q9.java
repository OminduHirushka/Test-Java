package Assignment.O1_FOP.A2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Ounces: ");
        double ounce = value.nextDouble();

        double gm = ounce * 28.3495;

        System.out.print(ounce + " ounces = "+ gm+ " grams");
    }
}
