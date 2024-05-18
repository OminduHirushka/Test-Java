package Assignment.O1_FOP.A5;

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int number = scanner.nextInt();
        int count = 0;

        while (number!=0){
            number = number/10;
            count++;
        }
        System.out.println("Number of Digits: "+ count);
    }
}
