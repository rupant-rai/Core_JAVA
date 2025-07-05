package S8_CoreConcepts.StringHandling;

public class Main {
    public static void main(String[] args) {
        String a= "Rupant";
        String b= "Rai";
        String c= a+b;
        System.out.println(c);// RupantRai

        if(a=="Rupant"){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        // side effect of overloadded operator: o/p will be false  
        if(c=="RupantRai"){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        // now we know that above problem was happening because of operator overloading.
        // so instead of operator we can use methods

        if(c.equals("RupantRai")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        System.out.println(c.replace("Rupant", "Priyansh"));
        

    }
}
