package A5;

public class Q23 {
    public static void main(String[] args) {
        /*
        for(int i=0;;i++){
            System.out.println("i : "+ i);
        }
        */                                                                 // Output --> An infinite loop

        /*
        int i=0;
        for(;i<10;){
            System.out.println("i : "+ i++);
        }
        */                                                                 // Output --> i : (0-9)

        /*
        for(int i=0;i<10;i++){
            System.out.println("i : "+ i++);
        }
        */                                                                 // Output --> 0 2 4 6 8

        /*
        for(char ch='A';ch<91;ch++){
            System.out.println("ch : "+ ch);
        }
        */                                                                 // Output --> ch : (A-Z)

        /*
        for(int i=0,j=10;i<=j;i++,j--){
            System.out.println(i+" "+ j);
        }
        */                                                                 // Output --> 0,10 1,9 2,8 3,7 4,6 5,5

        /*
        for(int i=0;i<128;i++){
            System.out.println((char)i+" "+ i);
        }
        */                                                                 // Output --> (ASCII_Character) 0-127

        /*
        int x=1;
        for(int i=0;i<10;i++){
            int k=100;
            System.out.println(x+k);
            k++;
        }
        */                                                                 // Output --> 101 (*10)

        /*
        int x;
        for(int i=0;i<10;i++){
            x=100;
            System.out.println(x++);
        }
        System.out.println(x);
        */                                                                 // Output --> Error (variable x might not have been initialized)
    }
}
