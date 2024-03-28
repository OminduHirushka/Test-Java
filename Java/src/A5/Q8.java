package A5;

public class Q8 {
    public static void main(String[] args) {
        for (int i=2; i<100; i++){
            for (int j=2; j<100; j++){
                if (i%j == 0){
                    System.out.println(j);
                }
            }
        }
    }
}
