package A4;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input The Amount You Want: ");
        double amount = scanner.nextDouble();

        double balance = 150000;
        double limit = 100000;
        double rate = 0.03;

        if (amount>balance){
            System.out.println("Insufficient Balance!");
        } else if (amount>limit) {
            System.out.println("Daily Limit is: "+ limit+ ". Try Less!");
        } else if (amount<5000) {
            double charge = amount * rate;
            double finalAmount = amount + charge;
            System.out.println("\nYou Are Charged "+ charge);
            System.out.println("Your Withdrawal Amount Is: "+ finalAmount);
        } else {
            System.out.println("Your Withdrawal Amount Is: "+ amount);
        }
    }
}

