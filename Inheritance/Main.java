package Inheritance;

public class Main {
    public static void main(String[] args) {
        Bike bike= new Bike("petrol",2,3,15,"LED","short");
        // bike.handle="Short";// only work when the handle is public in bike class
        bike.engine="Petrol";// only work when the engine in the vehicle class is public 
        System.out.println(bike.engine);// we are able to use the elements
        // of Vehicle class for  the object of Bike class  in Main class .

        //getting the properties of vehicle class which is inherited by the bike class

        System.out.println(bike.getLights());
        System.out.println(bike);// we will be using toString method to directly print the info of the object here. 
        //but we will get handle only becaue it is only elemet of bike class before inheritance
        
        // to print all other inherited elemnts  we concatinate +super.toString() in bike's toStrng
    }
}
