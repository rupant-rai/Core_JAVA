package S8_CoreConcepts.AbstractClass;

import S8_CoreConcepts.AbstractClass.Example.John;
import S8_CoreConcepts.AbstractClass.Example.Person;
import S8_CoreConcepts.AbstractClass.Example.Pooja;

public class Main {
    public static void main( String args[]){
        Person john= new John();
        john.eat();
        john.speak();

        Person pooja= new Pooja();
        pooja.eat();
        pooja.speak();

        Person p2= new Person()
        {
            @Override
            public void eat(){
                System.out.println("Eat food");
            }
        };

        p2.speak();
        p2.eat();
    }
}
