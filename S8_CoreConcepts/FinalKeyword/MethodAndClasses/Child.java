package S8_CoreConcepts.FinalKeyword.MethodAndClasses;

public class Child extends Parent {
    //if parent class or india method is marked final then the overriding will not be allowed and the chil will no be able to inherit the property of the the parent class 
    @Override
    public void india(){
        System.out.println("India is greatest");
    }
}
