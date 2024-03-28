package A5;

import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random number = new Random();

        for (int i=0; i<10; i++){
            int num = number.nextInt(101);

            if (num%2 != 0){
                System.out.println(num);
            }
        }
    }
}
