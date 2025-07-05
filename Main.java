
public class Main {
    public static void main(String args[]){
        // makinng an object of car class
        // Car car= new Car();
        // car.speed= 50;
        // System.out.println(car.speed);
        // car.setDoors("closed");
        // System.out.println(car.getDoors());

        // car.setDriver("seated");
        // car.setEngine("on");
        // car.setSpeed(15);
        // System.out.println(car.getSpeed());
        // System.out.println(car.run());  
        

        Car car= new Car("closed","on","seated",10);
        System.out.println(car.run());
    }
}
