package S10_Collections.ComparableInterface;

import java.util.LinkedList;
import java.util.List;

//we will be using the <Object> instead of <Name> type here
// we cannot use <Object> in compareto method here ,
//as Object doesnt have the name property . we will not be able to use comparable interface

public class Main2{
    public static void main(String[] args) {
        List<Object> element= new LinkedList<>();// instead of <Name> we can also use <Object>
        // as Object is mother of everything in JAVA;

        element.add(new Name("rk"));
        element.add(new Name("rai"));
        element.add(new Name("pk"));

        System.out.println(element);
        element.sort(null);
        System.out.println(element);// exception occurs if we do not use comparable interface bcz new Name is a custom objet .

    }
}

class Name implements Comparable<Name>{

    //we use comparable interface when we are using custom object and need to compare them.
    //used to define the natural ordering of objects
    // has only one method compareTo()
    private String name;

    public Name( String name){
        this.name= name;
    }

    @Override
    public String toString(){
        return name;
    }
    @Override
    public int compareTo(Name o){
        if( name.length()== o.name.length()){
            return 0;
        }
        else if(name.length()== o.name.length()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
