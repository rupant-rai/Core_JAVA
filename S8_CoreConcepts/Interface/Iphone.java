package S8_CoreConcepts.Interface;

public class Iphone implements Phone, Ios{
    // public String processor(){
    //     return "A15";
    // }
    @Override
    public String processor(){
        return "A15";
    }
    @Override
    public int spaceInGB(){
        return 256;
    }

    @Override
    public String AirDrop(){
        return "Copy and paste anywhere";
    }
}
