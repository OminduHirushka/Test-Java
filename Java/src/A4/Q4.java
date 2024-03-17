package A4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner shop = new Scanner(System.in);

        System.out.print("Name of the product: ");
        String product = shop.next();
        System.out.print("Input the unit price: ");
        int price = shop.nextInt();
        System.out.print("Input the amount: ");
        int amount = shop.nextInt();

        double total = price * amount;
        System.out.println("\nTotal price:"+ total);

        if (total>1500){
            System.out.println("\nYou are entitled to the super draw!");
        } else {
            System.out.println("Try Again!");
        }
    }
}

