package A4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = number.nextInt();

        int absNum;

        if (num1>0){
            absNum = num1;
            System.out.println("Absolute Number Of "+ num1+ " = "+ absNum);
        } else {
            absNum = -num1;
            System.out.println("Absolute Number Of "+ num1+ " = "+ absNum);
        }
    }
}

