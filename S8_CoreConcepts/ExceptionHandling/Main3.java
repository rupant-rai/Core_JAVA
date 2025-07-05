//section 120:- Throw keyword

package S8_CoreConcepts.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.annotation.processing.Filer;

public class Main3 {
    public static void main(String[] args) {
        Main3 main= new Main3();
        // main.doSomething();//here it need to be handle the exception thrown by the throws keyword
        //as we are calloint the doSomething fuction then we have to handle the excpetion before exicution other wise it wll throw exception
        try {
            main.doSomething();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //try catch to handle the exception
    // public void doSomething(){
    //     try {
    //         FileReader in= new FileReader("text.txt");
    //     } catch (FileNotFoundException e) {
    //         e.printStackTrace();
    //     }
    //     System.out.println("Do Someting");
    //}

    //throws to handle exception

    public void doSomething() throws FileNotFoundException{
        
        FileReader in= new FileReader("text.txt");
        System.out.println("Do Someting");
    }
}
