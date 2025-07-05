package Polymorphism;

import Polymorphism.Example.Iphone;
import Polymorphism.Example.Nokia3310;
import Polymorphism.Example.Phone;

public class Main {
    public static void main( String args[]){
        // this is not polymorphism
        // Phone phone= new Phone();
        // phone.feature();

        // Nokia3310 nokia= new Nokia3310();
        // nokia.feature();

        // Iphone iphone= new Iphone();
        // iphone.feature();

        //this is polymorphism

        //instead of creating an object we will cxreate a reference

        Phone phone;// reference
        phone= new Nokia3310();//this can be -> new Phone() or new Iphone()
        phone.feature();// now here the the fetaure of the Nokia3310 will be printed as we have defined the the phone reference with the object of the Nokia3310 class 
    }
}
