package A5;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totHeight = 0;
        double totWeight = 0;
        double avgHeight;
        double avgWeight;

        for (int i=1; i<=10; i++){
            System.out.print("Input Student "+ i+ " Height: ");
            double height = scanner.nextDouble();
            System.out.print("Input Student "+ i+ " Weight: ");
            double weight = scanner.nextDouble();

            System.out.println();

            if (height!=0){
                totHeight = totHeight + height;
            } else {
                System.out.println("Your height can't be 0. Input valid details.");
            }

            if (weight!=0){
                totWeight = totWeight + weight;
            } else {
                System.out.println("Your weight can't be 0. Input valid details.");
            }
        }

        avgHeight = totHeight/10;
        avgWeight = totWeight/10;

        System.out.println("Average Height is: "+ avgHeight);
        System.out.println("Average Weight is: "+ avgWeight);
    }
}
