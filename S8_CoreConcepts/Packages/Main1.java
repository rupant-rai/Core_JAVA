package S8_CoreConcepts.Packages;

import S8_CoreConcepts.Packages.Example1.Home;


public class Main1 {
    public static void main(String[] args) {
        Home home1= new Home();
        home1.message();

        S8_CoreConcepts.Packages.Example2.Home home2= new S8_CoreConcepts.Packages.Example2.Home();
        home2.message();
    }
}
