package S8_CoreConcepts.FinalKeyword.Variable;

public class Main {
    public static void main(String[] args) {
        Child child= new Child();
        System.out.println(child.getX());
        //child.setX(15);

        Child child2= new Child(99);// here the varibale can be initilized once
        System.out.println(child2.getX());

        Child child3= new Child(100); // same here also
        System.out.println(child3.getX());

        // it means that each time when we create a new object we can assign a value to the final variable atleat once
    }
}
