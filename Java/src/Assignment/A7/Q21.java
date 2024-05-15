package Assignment.A7;

public class Q21 {
    public static void main(String[] args) {
        int x = 0;
        int[] xr = new int[3];
        double d = 0.0;
        double[] dr = new double[5];
        int[] grade = {'a', 'b'};

        x = xr[0];
        xr[0] = x;
        // x = xr;
        // xr = x;
        dr[0] = xr[0];                  // Integer value can be assigned to a double value
        // xr[0] = dr[0];               // Double value can not be assigned to an integer value
        xr[0] = (int) dr[0];
        // xr = dr;
        // dr = (double[]) xr;
        // dr = xr;
        // xr = (int) dr;
        // xr = (int[]) dr;
    }
}
