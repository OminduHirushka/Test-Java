package A4;

public class Q15 {
    public static void main(String[] args) {
        int x = 99;
        if(x++==x){
            System.out.println("x++==x : "+x);
        }

        x = 99;
        if(++x==x){
            System.out.println("++x==x : "+x);
        }

        x = 99;
        if(x==x++){
            System.out.println("x==x++ : "+x);
        }

        x = 99;
        if(x==++x){
            System.out.println("x==++x : "+x);
        }

        x = 99;
        if(++x==++x){
            System.out.println("++x==++x : "+x);
        }

        x = 99;
        if(x++==x++){
            System.out.println("x++==x++ : "+x);
        }

        x = 99;
        if(++x==x++){
            System.out.println("++x==x++ : "+x);
        }

        x = 99;
        if(x++==++x){
            System.out.println("x++==++x : "+x);
        }
    }
}

