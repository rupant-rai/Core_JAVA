package S8_CoreConcepts.ExceptionHandling;
//section 116
public class Main {
    public static void main(String[] args) {
        Main main= new Main();
        main.case1(10, 2);
        main.case1(10,0);
        main.case2(10,2);
        main.case2(10,0);

        // section 117 starts

        try{
            System.out.println("Before exception");//this will run
            System.out.println("During exception"+10/0);//no partial run. i.e., entire line eill not run
            System.out.println("after exceptiomn");// this will also not run
        }
        // catch(Exception e){
        //     System.out.println("Divide by 0 exception");
        //     System.out.println(e);
        //     e.printStackTrace();// this print the exact line were error has been occured
        // }
        //section 117 closes

        //section 118 starts

        catch(ArithmeticException e){
            System.out.println("airthmetic exception");
        }

        catch(Exception e){
            System.out.println("Exception");
        }

        //section 118 closes


    }

    public void case1(int x, int y){
        if( y!=0){
            System.out.println("x/y="+ x/y);
        }
        else{
            System.out.println("Exception as y cannot be zero");
        }
    }

    public void case2(int x, int y){
        try{
            System.out.println("x/y="+ x/y);
        }
        catch(Exception e){
            System.out.println("Exception as y cannot be zero"+ e);
        }
    }
}
