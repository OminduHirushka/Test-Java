package Assignment.A5;

public class Q54 {
    public static void main(String[] args) {
        int k=0;
        int l=0;

        for (int i=0; i<=3; i++) {
            k++;
            if (i == 2) break;  //continue;  //return;            // break;(3,2)   continue;(4,3)   return;(nothing)
            l++;
        }
        System.out.println(k + ", " + l);
    }
}
