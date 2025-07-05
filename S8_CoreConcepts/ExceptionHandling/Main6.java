//checked and unchecked exception 

package S8_CoreConcepts.ExceptionHandling;

import java.io.FileNotFoundException;

public class Main6 {
    public static void main(String[] args) {
        Main6 main= new Main6();
        main.doSomething(); // unchecked exception need not to be handled
        //but when checked exception imn 2nd method we have to handle the exception
        try{
            main.doSomething2();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void doSomething(){
        String x= "Zero";
        if( x.equals("Zero")){
            throw new RuntimeException();// unchecked exception: nee not to be handled 
        }
    }

    public void doSomething2() throws FileNotFoundException{
        String x= "Zero";
        if( x.equals("Zero")){
            throw new FileNotFoundException();// checked exception: need to be handled 
        }
    }
}
