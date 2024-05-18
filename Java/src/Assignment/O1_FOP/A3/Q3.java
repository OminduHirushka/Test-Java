package Assignment.O1_FOP.A3;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        int age;

        System.out.print("Input Your Age: ");
        age = old.nextInt();
        System.out.println("Age: "+ age);

        age = age + 3;
        System.out.println("New Age: "+ age);
    }
}
