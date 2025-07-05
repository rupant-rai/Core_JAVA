package S8_CoreConcepts.Interface;

public class Main {
    public static void main(String[] args) {
        // SamsungPhone p1= new SamsungPhone();
        // String p= p1.processor();
        // System.out.println(p);
        // System.out.println(p1.spaceInGB());

        // Iphone p2= new Iphone();
        // String s=p2.processor();// here we cannot use the variable p
        // System.out.println(s); 
        // System.out.println(p2.spaceInGB());

        //#S8 Interface with polymorphism and multiple inheritance
        // Phone p1= new SamsungPhone();// we cannot access other methods which are not in the phone interface
        SamsungPhone p1= new SamsungPhone();// now we cann access the methods inside the samsungPhone class.
        String p= p1.processor();
        System.out.println(p);
        System.out.println(p1.spaceInGB());
        System.out.println(p1.whatsapp());
    }
}
 