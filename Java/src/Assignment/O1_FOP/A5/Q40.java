package Assignment.O1_FOP.A5;

public class Q40 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (i<1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
            i++;
        }

        System.out.println("The sum of all multiples of 3 or 5 below 1000 is: "+ sum);
    }
}
