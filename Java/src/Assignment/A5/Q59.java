package Assignment.A5;

public class Q59 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        label1: while (i++<5) {
            label2: for (;;) {
                label3: do {
                    System.out.print(i+" "+j+" ");
                    switch (i + j++) {
                        case 0: continue label3;
                        case 1: continue label2;
                        case 2: continue label1;
                        case 3: break;
                        case 4: break label3;
                        case 5: break label2;
                        case 6: break label1;
                        default: break label1;
                    }
                } while (++j<5);
            }
        }
    }
}
