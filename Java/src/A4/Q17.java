package A4;

public class Q17 {
    public static void main(String[] args) {
        int x = 99;
        int y = 99;

        if(x++==y){
            System.out.println("x++==y : "+x+" : "+y);
        }
        if(++x==y){
            System.out.println("++x==y : "+x+" : "+y);
        }
        if(x==y++){
            System.out.println("x==y++ : "+x+" : "+y);
        }
        if(x==++y){
            System.out.println("x==++y : "+x+" : "+y);
        }
        if(++x==++y){
            System.out.println("++x==++y : "+x+" : "+y);
        }
        if(x++==y++){
            System.out.println("x++==y++ : "+x+" : "+y);
        }
        if(++x==y++){
            System.out.println("++x==y++ : "+x+" : "+y);
        }
        if(x++==++y){
            System.out.println("x++==++y : "+x+" : "+y);
        }
    }
}
