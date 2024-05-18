package Assignment.O1_FOP.A4;

public class Q12 {
    public static void main(String[] args) {
        int x = 10;
        boolean b = true;

        // if (b){}                            // Legal

        // if (b=false){}                      // Legal (syntactically valid)

        // if (b==false){}                     // Legal

        // if(b=false==false){}                // Legal (syntactically valid)

        // if((b=false)==false){}              // Legal

        // if(b=(false==true)){}               // Legal (syntactically valid)
    }
}
