package S8_CoreConcepts.InnerClass.AnonymousObject;

public class Main {
    public static void main(String[] args) {
        // Lock lock = new Lock();
        // if( lock.getCode()== "123456"){
        //     System.out.println("door is open");
        // }
        // else{
        //     System.out.println("door is closed");
        // }

        // in the above code we can see that the object is used only once 
        //then we can create an anonymous object instead of creating the object at the top , 
        //we can make anonymous object where we want to use the object

        if( new Lock().getCode()== "123456"){ // anonymous object is create here. new Lock()
            System.out.println("door is open");
        }
        else{
            System.out.println("door is closed");
        }

        // using command line argument is also here. please search for this 
    }
}
