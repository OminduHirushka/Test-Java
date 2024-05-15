package Assignment.A4;

public class Q16 {
    public static void main(String[] args) {
        int x = 99;

        if(x++==x){
            System.out.println("x++==x : "+x);
        }
        if(++x==x){
            System.out.println("++x==x : "+x);
        }
        if(x==x++){
            System.out.println("x==x++ : "+x);
        }
        if(x==++x){
            System.out.println("x==++x : "+x);
        }
        if(++x==++x){
            System.out.println("++x==++x : "+x);
        }
        if(x++==x++){
            System.out.println("x++==x++ : "+x);
        }
        if(++x==x++){
            System.out.println("++x==x++ : "+x);
        }
    }
}
