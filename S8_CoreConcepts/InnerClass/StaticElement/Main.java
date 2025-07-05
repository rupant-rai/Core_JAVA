package S8_CoreConcepts.InnerClass.StaticElement;

public class Main {
    public static void main(String[] args) {
        TestStatic obj1= new TestStatic();
        System.out.println("obj 1 = "+ obj1.getStaticVar());
        obj1.setStaticVar(25);
        System.out.println("obj 1 = "+ obj1.getStaticVar());


        TestStatic obj2= new TestStatic();
        System.out.println("obj 2 = "+ obj2.getStaticVar());
        obj2.setStaticVar(12);
        System.out.println("obj 2 = "+ obj2.getStaticVar());
    }
}
