package Assignment.A5;

public class Q30 {
    public static void main(String[] args) {
        /*
        for(int i=0;i<10;i++){}
        */                                              // Legal

        /*
        for(i=0;i<10;i++){}
        */                                              // Illegal

        /*
        for(int i=0;;i++){}
        */                                              // Legal

        /*
        for(int i=0;i<10;){}
        */                                              // Legal

        /*
        for(double d=0;d<10;d++){}
        */                                              // Legal

        /*
        for(;;){}
        */                                              // Legal

        /*
        for(byte b=0;b<10;b++){}
        */                                              // Legal

        /*
        for(;int i=0;){}
        */                                              // Illegal

        /*
        for(int i=0,j=10;i++;j++){}
        */                                              // Illegal

        /*
        for(int i=0;;){}
        */                                              // Legal

        /*
        for(char ch='A'; ch>92;ch++){}
        */                                              // Legal
    }
}
