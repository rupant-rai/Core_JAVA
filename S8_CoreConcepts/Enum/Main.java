package S8_CoreConcepts.Enum;

public class Main {
    // public static final int COREJAVA= 1;
    // public static final int COLLECTIONS= 2;
    // public static final int GENERICS=3;
    // public static final int JSP= 4;
    // public static final int MULTITHREADING= 5;

    public static void main( String args[]){
        // int learning = JSP;
        // switch(learning){
        //     case COREJAVA -> System.out.println("Core java");
        //     case COLLECTIONS -> System.out.println("COLLECTIONS");
        //     case GENERICS-> System.out.println("GENERICS");
        //     case JSP -> System.out.println("JSP");
        //     case MULTITHREADING -> System.out.println("MULTITHREADNG");

        Learninng learning= Learninng.JSP ;
        switch(learning){
            case COREJAVA -> System.out.println("Core java");
            case COLLECTIONS -> System.out.println("COLLECTIONS");
            case GENERICS-> System.out.println("GENERICS");
            case JSP -> System.out.println("JSP");
            case MULTITHREADING -> System.out.println("MULTITHREADNG");
        }

        System.out.println(Learninng.COREJAVA);
    }
}
