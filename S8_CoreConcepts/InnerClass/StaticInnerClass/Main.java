package S8_CoreConcepts.InnerClass.StaticInnerClass;

public class Main {
    public static void main(String[] args) {
        //Outer outer= new Outer();
        //outer.message();// here the static method can be called in non static way also. It is valid but not recomended

        //Outer.message();// static metgod is called in the static way ( using the class name only). it is recomended.

        //when we use the the static inner class

        Outer.Inner.staticMessage();
        System.out.println(Outer.Inner.x);
    }
}
