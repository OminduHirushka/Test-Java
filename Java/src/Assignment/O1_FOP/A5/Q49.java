package Assignment.O1_FOP.A5;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = 0;
        int studentCount = 0;


        System.out.println("Enter the marks of students. Enter -1 to Exit.");

        while (true) {
            System.out.print("Enter the number of students in the class: ");
            int stu = scanner.nextInt();
            if (stu == -1) {
                break;
            }

            int total = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            double average;


            for (int i=0; i<stu; i++){
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

            average = (double) total/stu;

            System.out.println("Number of Students: "+ stu);
            System.out.println("Total: "+ total);
            System.out.println("Max: "+ max);
            System.out.println("Min: "+ min);
            System.out.println("Average: "+ average);
            studentCount++;
        }
    }
}
