package A7;

public class Q2 {
    public static void main(String[] args) {
        // a
        final int ARRAY_SIZE = 10;

        // b
        double[] fractions = new double[ARRAY_SIZE];

        // c
        double ele4 = fractions[4];

        // d
        fractions[9] = 1.667;

        // e
        fractions[6] = 3.333;

        // f
        double sum = 0;
        for (int x = 0; x < fractions.length; x++) {
            sum += fractions[x];
        }
        System.out.println("Sum: " + sum);
    }
}
