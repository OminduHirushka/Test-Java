package Assignment.O2_OOP.A1.Q53;

class ValHold {
    public int i = 10;
}

public class Q53 {
    public static void main(String[] args) {
        Q53 o = new Q53();
        o.aMethod();
    }

    public void aMethod() {
        int i = 99;
        ValHold v = new ValHold();
        v.i = 30;
        another(v, i);
        System.out.println(v.i);
    }

    public void another(ValHold v, int i) {
        i = 0;
        v.i = 20;
        ValHold vh = new ValHold();
        v = vh;
        System.out.println(v.i + " " + i);
    }
}
