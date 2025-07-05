// throw keyword example

package S8_CoreConcepts.ExceptionHandling;

import javax.management.RuntimeErrorException;

public class Main4 {
    public static void main(String[] args) {
        Main4 main = new Main4();
        //main.doSomewthing(); as we are throwing the exception manually.
        // so we also ahave to handle the thrown exception 
        try{
            main.doSomething();
        }finally{
            System.out.println("This demo is useless");
        }
    }

    public void doSomething(){
        String x= "Zero";
        if( x.equals("Zero")){
            throw new RuntimeException();
        }
        System.out.println("Do something");// thia atatement will only execute if the if condition is not stisfied
    }
}
