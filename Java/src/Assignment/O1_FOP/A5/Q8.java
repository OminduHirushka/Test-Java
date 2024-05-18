package Assignment.O1_FOP.A5;

public class Q8 {
    public static boolean isPrime(int num) {
        boolean p = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                p = false;
                break;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        for (int i=2; i<100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
