package S8_CoreConcepts.InnerClass.StaticInnerClass;

public class Outer {
    // public void message(){
    //     System.out.println("heelo static ");
    // }

    // public static void message(){
    //     System.out.println("heelo static ");
    // }

    // STATIC inner class is used when all the elements inside it are also static
    public static class Inner{

        public static int x =4;
        public static void staticMessage(){
            System.out.println("heelo static ");
        }
    }
    
}
