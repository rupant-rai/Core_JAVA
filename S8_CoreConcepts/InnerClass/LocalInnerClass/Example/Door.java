package S8_CoreConcepts.InnerClass.LocalInnerClass.Example;

public class Door {
    public boolean isLocked(String key){
        //class defined within the method- Local Inner class
        class Lock{
            public boolean isLocked( String key){
                if( key.equals("qwerty")){
                    return false;
                }
                else{
                    return true;
                }
            }
        }

        return new Lock().isLocked(key);//anonymous class - where we re not saving the class and rather using it once.
    }
}
