package Inheritance;

public class Vehicle {
   
    public String engine;
    private int wheels;
    private int seats;
    private int fueltank;
    private String lights;

    public Vehicle() {
        wheels= 2;
        seats=2;
        fueltank=4;
        lights="LED";
    }

    public Vehicle(String engine, int wheels, int seats, int fueltank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fueltank = fueltank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFueltank() {
        return fueltank;
    }

    public String getLights() {
        return lights;
    }

    @Override
    public String toString() {
        return "Vehicle [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats + ", fueltank=" + fueltank
                + ", lights=" + lights + "]";
    }
}
