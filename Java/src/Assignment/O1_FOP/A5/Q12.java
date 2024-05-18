package Assignment.O1_FOP.A5;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double average;

        for (int i=0; i<10; i++){
            System.out.print("Input Marks: ");
            int marks = scanner.nextInt();

            total = total + marks;

            if (marks>max){
                max = marks;
            }
            if (marks<min){
                min = marks;
            }
        }

        average = (double) total/10;

        System.out.println("Total: "+ total);
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
        System.out.println("Average: "+ average);
    }
}
