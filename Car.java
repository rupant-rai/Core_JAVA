



public class Car {
    //we can also initialize thsi instaance variable her also
    //it is one of the the way to initialize inctance variable
    private String doors;//like-> doors="closed"
    private String engine;// engine="on"
    private String driver;//driver="seated"
    // public int speed;
    private int speed;//speed="10"



    //constructors:- on of the way to intialize the instance variable
    //initially the car mighht not be running so->
    public Car(){
        doors="closed";
        engine="off";
        driver="away";
        speed=0;
    }
    //no the car will run or not will depend on the user
    // create a constrcter in which user will have 
    //option to make the attribute complete according to 
    //the statndars to make the car run
    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDoors(String doors){
        this.doors= doors;
    }

    public String getDoors(){
        return doors;
    }

    // adding a functionality
    public String run(){
        if( doors.equals("closed") && engine.equals("on")
        && driver.equals("seated" )&& speed>0){
            return "running";
        }else{
            return "not runnig";
        }

    }
}
 