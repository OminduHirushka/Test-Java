package Assignment.O1_FOP.A2;

public class Q3 {
    public static void main(String[] args) {
        int n = 3;

        //Upper Inverted Pyramid
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "); //Print spaces
            }
            for (int k = i; k <= n - 1; k++) {
                System.out.print("*" + " "); //Print Star and Space
            }
            System.out.println(""); //Print New line
        }

        //For lower Pyramid
        for (int i =1; i <= n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "); //Print blank space
            }
            for (int k = i; k <= n - 1; k++) {
                System.out.print("*" + " "); //Print star and blank space
            }
            System.out.println(""); //New line
        }
    }
}
