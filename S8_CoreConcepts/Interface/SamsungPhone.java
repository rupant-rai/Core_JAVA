package S8_CoreConcepts.Interface;

public class SamsungPhone implements Phone, Andorid {
    // public int processor(){
    //     return 888;
    // } 
    @Override
    public String processor(){
        return "SD888";
    }
    @Override
    public int spaceInGB(){
        return 256;
    }

    @Override
    public String whatsapp(){
        return "send msg";
    }
    
}
