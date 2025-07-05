package S8_CoreConcepts.ExceptionHandling;
 //section 118 & 119:- multiple catches and finally 
public class Main2 {
    public static void main(String[] args) {
       
        int y = 0, x;

        try{
            System.out.println("Before exception");//this will run
            x= (y=10*10)/0;//no partial run. i.e., entire line eill not run
            System.out.println("after exceptiomn");// this will also not run
        }

        // catch(ArithmeticException e){
        //     System.out.println("airthmetic exception");
        // }

        // catch(Exception e){
        //     System.out.println("Exception");
        // }
        //always mustr be placed in the last 
        //will also run if there is no catch statement
        finally{
            System.out.println(y+"its is finaly block. It has special power thta it will run no matter if there is exception or not");
        }

    }
}
