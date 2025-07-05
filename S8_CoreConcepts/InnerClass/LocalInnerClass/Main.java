package S8_CoreConcepts.InnerClass.LocalInnerClass;

import S8_CoreConcepts.InnerClass.LocalInnerClass.Example.Door;

public class Main {
    public static void main(String[] args) {
        Door door= new Door();
        System.out.println(door.isLocked("qwerty"));
        System.out.println(door.isLocked("weferg"));

        //we cam also enhance this by uising command line arguments
        //search how to run command line artgumenmts in vs code
        if( door.isLocked(args[0])){
            System.out.println("door is locked");
        }else{
            System.out.println("door is unlocked");
        }
    }
}
