package Assignment.O1_FOP.A5;

public class Q17 {
    public static void main(String[] args) {
        /* int i=0;
        for(int i=0;i<10;i++){} */                            // Error

        /* for(int i=0;i<10;i++){}
        for(int i=0;i<10;i++){} */                            // Legal

        /* for(int i=0;i<10;i++){
            int i=3;
        } */                                                  // Error

        /* {int i=0;}
        for(int i=0;i<10;i++){} */                            // Legal
    }
}
