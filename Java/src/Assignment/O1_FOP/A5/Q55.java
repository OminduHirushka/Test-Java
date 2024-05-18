package Assignment.O1_FOP.A5;

public class Q55 {
    public static void main(String args[]){
        for(int i=0; i<10; i++){
            int j = i % 3;

            switch(j){
                case 0: System.out.print("A ");
                    break;
                case 1: System.out.print("B ");
                    break;
                default: System.out.print(j+" ");
            }
        }
    }
}
