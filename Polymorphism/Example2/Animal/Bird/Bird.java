package Polymorphism.Example2.Animal.Bird;

import Polymorphism.Example2.Animal.Animal;

public class Bird extends Animal {
    protected boolean feather= true;
    protected boolean canFly= true;
    
    public Bird(boolean feather, boolean canFly) {
        this.feather = feather;
        this.canFly = canFly;
    }
}
