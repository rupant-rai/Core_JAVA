package S8_CoreConcepts.InnerClass.AnonnymousInnerClass;

public class Main {
    public static void main(String[] args) {

        // Lock lock = new Lock() {
        //     @Override
        //     public void isUnlocked( String key){
        //         if(key.equals("qwerty")){
        //             System.out.println("Open");
        //         }
        //         else{
        //             System.out.println("closed");
        //         }
        //     }
        // };

        // lock.isUnlocked("asdfg");

        new Lock(){// anonymous inner classs is used
            @Override
            public void isUnlocked( String key){
                if(key.equals("qwerty")){
                    System.out.println("Open");
                }
                else{
                    System.out.println("closed");
                }
            }
        }.isUnlocked("asdfg");
    }
}
