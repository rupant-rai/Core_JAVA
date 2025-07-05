// user defined exception exmaple

package S8_CoreConcepts.ExceptionHandling;

public class Main5 {
    public static void main(String[] args) {
        Main5 main= new Main5();

        // no was we have thrown the exception and we want to use the function then we have to handle the excption as well 
        try{
            main.doSomething();
        }
        catch(ZeroException e){
            e.printStackTrace();
        }
    }

    // user defined exception: by extending the Exception class

    class ZeroException extends Exception{

    }

    public void doSomething() throws ZeroException{
        String x= " Zero";
        if( x.equals("Zero")){
            throw new ZeroException();
        }

        //we can also throw multiple exceptions
        System.out.println("Do something");
    }
}
