package S8_CoreConcepts.InnerClass.StaticInnerClass.Example2;

public class Main {
    public static void main(String[] args) {
        // System.out.println(ToyotaCars.Brand.brandname);

        ToyotaCars toyotaCars = new ToyotaCars();
        toyotaCars.nonStaticInner.model("Innova");
    }
}
