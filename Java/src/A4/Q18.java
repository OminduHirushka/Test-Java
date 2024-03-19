package A4;

public class Q18 {
    public static void main(String[] args) {
        int x = 9;

        if (x>=10){
            System.out.println("Success");
        }

        if (x++>=10){
            System.out.println("Success");
        }

        if (++x>=10){
            System.out.println("Success");                              // Prints
        }

        if (++x>=x++){
            System.out.println("Success");                              // Prints
        }

        if (++x>x++){
            System.out.println("Success");
        }

        if (x++>=x++){
            System.out.println("Success");
        }

        if (++x<=x++){
            System.out.println("Success");                              // Prints
        }

        if (x<=x++){
            System.out.println("Success");                              // Prints
        }
    }
}

