package S8_CoreConcepts.InnerClass.StaticInnerClass.Example2;

public class ToyotaCars {

    NonStaticInner nonStaticInner= new NonStaticInner();// object of nonstatic inner class
    private int x= 10;
    //static inner class 
    public static class Brand{
        // public static String brandname= "Toyota";
        private static String brandname= "Toyota";
        public static void getMoto(){
            System.out.println("Reliable cars");

        } 
    }
    //Non static inner class
    public class NonStaticInner{
        public void model(String model){
            System.out.println("model = "+ model);
            System.out.println("Brand name= "+ Brand.brandname);
            System.out.println("Value of x = "+ x);
        }
    }
    public NonStaticInner getNonStaticInner() {// getter
        return nonStaticInner;
    }
}
