package Assignment.A4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        int absNum;

        if (num>0){
            absNum = num;
            System.out.println("Absolute Number Of "+ num+ " = "+ absNum);
        } else {
            absNum = -num;
            System.out.println("Absolute Number Of "+ num+ " = "+ absNum);
        }
    }
}
