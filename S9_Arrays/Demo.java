package S9_Arrays;

public class Demo {
    public static void main(String[] args) {
        int value=2;
        Demo demo= new Demo();
        demo.display(value);
        System.out.println("value from the method="+value);// o/p will be 2 instead of 20;
        //this is because in java we pass the copy of the varaible not the orignal variable itself.
    }

    void display(int value){
        System.out.println("value = "+value);
        value=20;
        System.out.println("value = "+value);
    }
}
