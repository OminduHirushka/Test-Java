package A5;

public class Q50 {
    public static void main(String[] args) {
        int a,b,c,d,e;
        for (int i = 0; i < 10; i++){
            a=i;
        }

        int j=0;
        while(j++<10){
            b=j;
        }

        int k=0;
        do{
            c=j;
        }while(j++<10);

        int m=0;
        switch(m){
            case 0 : d=0;
        }

        int n=0;
        switch(n){
            default : e=0;
        }

        //System.out.println(a);          //Line 24     output--> variable a might not have been initialized (declared outside the loop)
        //System.out.println(b);          //Line 25     output--> variable b might not have been initialized (declared outside the loop)
        System.out.println(c);            //Line 26     output--> 11
        //System.out.println(d);          //Line 27     output--> variable d might not have been initialized (declared outside the loop)
        System.out.println(e);            //Line 28     output--> 0
    }
}
