package Assignment.A2;

public class Q7 {
    public static void main(String[] args) {
        int Computing, Maths, Science, English;
        Computing = 90;
        Maths = 74;
        Science = 59;
        English = 63;

        int total = Computing+Maths+Science+English;

        System.out.println("\nThe Total Is: "+ total);

        System.out.println("\nThe Total Is: "+ (Computing+Maths+Science+English));

        System.out.println("");
        System.out.println(Computing + " " + Maths + " " + Science + " " + English);

        double average = 0.0;

        average = (double)total/4;
        System.out.println("\nThe Average Is: "+ average);

    }
}
