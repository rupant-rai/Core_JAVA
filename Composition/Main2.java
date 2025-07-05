package Composition;
import Composition.Laptop.Laptop;
import Composition.Laptop.Componenets.GraphicCard;
import Composition.Laptop.Componenets.Processor;
public class Main2 {
    public static void main( String args[]){
        Laptop laptop= new Laptop();
        System.out.println(laptop.getScreen());
        System.out.println(laptop.getProcessor().getBrand());
        //using default constructors 
        Processor p1= new Processor();
        GraphicCard g1= new GraphicCard();
        //Using parameterised constructors
        Laptop l1= new Laptop(24.0f, p1, "DDR5", "1TB", g1, "Single layer","backlight"); 
        System.out.println(l1);
    }
}
