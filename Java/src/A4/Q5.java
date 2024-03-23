package A4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the product: ");
        String product = scanner.next();
        System.out.print("Input the unit price: ");
        int price = scanner.nextInt();
        System.out.print("Input the amount: ");
        int amount = scanner.nextInt();

        double total = price * amount;

        if (total>500){
            double discount = total * 0.05;
            total = total - discount;

            System.out.println("\nDiscount: "+ discount);
            System.out.println("Total price with discount: "+ total);
        } else {
            System.out.println("\nNo discount given.");
            System.out.println("Total price: "+ total);
        }
    }
}
