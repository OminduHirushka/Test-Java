package Assignment.O1_FOP.A5;

public class Q16 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i++);
        }

        for (int i = 0; i < 10; i++){
            System.out.println(++i);
        }

        int j=0;
        while(j<10){
            System.out.println(j);
            j++;
        }

        int k=0;
        while(k<10){
            System.out.println(k++);
        }

        int m=0;
        while(m<10){
            System.out.println(++m);
        }

        int n=0;
        while(n++<10){
            System.out.println(n);
        }

        int p=0;
        while(++p<10){
            System.out.println(p);
        }

        int q=0;
        do{
            System.out.println(q++);
        }while(q<10);

        int s=0;
        do{
            System.out.println(++s);
        }while(s<10);

        int t=0;
        do{
            System.out.println(t);
        }while(t++<10);

        int u=0;
        do{
            System.out.println(u);
        }while(++u<10);
    }
}
