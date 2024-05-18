package Assignment.O1_FOP.A5;

public class Q62 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.println(i+ " "+ j);
            }
        }

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.println(j+ " "+ i);
            }
        }

        for (int i=5; i>=1; i--){
            for (int j=0; j<=4; j++){
                System.out.println(i+ " "+ j);
            }
        }

        for (int i=5; i>=1; i--){
            for (int j=5; j>=1; j--){
                System.out.println(i+ " "+ j);
            }
        }
    }
}
