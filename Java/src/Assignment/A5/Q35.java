package Assignment.A5;

public class Q35 {
    public static void main(String[] args) {
        int i = 2;

        while (i<100){
            int j = 2;
            while (j<100){
                if (i/j == 0){
                    System.out.println(j);
                }
                j++;
            }
        }
        i++;
    }
}
