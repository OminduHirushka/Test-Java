package Assignment.A5;

public class Q20 {
    public static void main(String[] args) {

        /*
        for(int i=100;i<110;i++){
            System.out.println(i);
        }
        */                                               // Legal

        /*
        for(int i=100;i<110;i++){
            System.out.println(i++);
        }
        */

        /*
        for(int i=0;i<10;i++){
            int k=100;
            System.out.println(i+k);
        }
        */                                               // Legal

        /*
        for(int i=0;i<10;i++){
            int k=100;
            System.out.println(k);
            k++;
        }
        */

        /*
        int k=100;
        for(int i=0;i<10;i++){
            System.out.println(k);
            k++;
        }
        */                                               // Legal
    }
}
