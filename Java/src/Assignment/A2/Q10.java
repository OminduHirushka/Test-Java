package Assignment.A2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);

        int[] marks = new int[10];

        System.out.println("Input Marks: ");
        for (int i=0; i<10; i++){
            marks[i] = mark.nextInt();
        }

        int total = 0;
        for (int sub : marks){
            total += sub;
        }

        float avg = (float)total/10;

        System.out.println("Marks: "+ java.util.Arrays.toString(marks));
        System.out.println("Total: "+total);
        System.out.println("Average: "+ avg);

    }
}
