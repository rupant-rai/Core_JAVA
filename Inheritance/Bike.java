package Inheritance;

public class Bike extends Vehicle{
    private  String handle;
    public Bike(){
        handle="shorty";
    }
    
    public Bike(String engine, int wheels, int seats, int fueltank, String lights, String handle) {
        super(engine, wheels, seats, fueltank, lights);
        //super method is used to pass these parameters to the constructor of the parent class
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }
    @Override
    public String toString() {
        return "Bike [handle=" + handle + "]" +super.toString();
    }
}
