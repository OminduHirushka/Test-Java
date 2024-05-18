package Assignment.O1_FOP.A3;

import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your age : ");
        int age=input.nextInt();
        System.out.println("Your current age is : "+age);

        age = age + 10;
        System.out.println("Your age after 10 years is : " +age);
    }
}

