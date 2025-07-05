package S8_CoreConcepts.AccessModifiers.Example;

public class Base {
    //int x= 55;// cannot be accessed from the Main class or outside package
    public int x= 55; //can be accessed from anywhere
    //private int y= 50;// only accessable in the same class

    //protected int x= 45;// if the main is outside the package then it cannnot be accessed
}
