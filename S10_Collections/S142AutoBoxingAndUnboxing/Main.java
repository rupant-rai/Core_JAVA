package S10_Collections.S142AutoBoxingAndUnboxing;

import java.util.ArrayList;

// ArrayList can contains objects only not any primitive datatype. 
// but we can use Wrapper classes like <Integer>, <Character>, <Float> <Boolean> etc

//we can alos create our own wrapper class like this
// but we cannot use like this. this is in the next section
// class IntWrapper{
//     public int num;
// }

public class Main {
    public static void main(String[] args) {
        //ArrayList<int> al= new ArrayList<>();// this is not correct bcz <int>
        // as int is a primitive datatype.
        // and primitive datatype argument is not allowed .
        // so we have to use non primitive type or class
        // this class is called rapper class 
        ArrayList<Integer> al= new ArrayList<>();
        al.add(234);
        al.add(123);
        System.out.println(al);

    }
}
