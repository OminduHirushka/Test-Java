package Assignment.A4;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Input student average : ");
        double avg = scanner.nextDouble();

        if(avg>=50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        System.out.println("Thanking you..");
    }
}
