package Assignment.O1_FOP.A3;

import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input number 1 : ");
        int num1=input.nextInt();

        System.out.print("Input number 2 : ");
        int num2=input.nextInt();

        System.out.println(num1+" "+num2);

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println(num1+" "+num2);
    }
}
