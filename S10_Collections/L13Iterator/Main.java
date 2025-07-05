package S10_Collections.L13Iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> li= new LinkedList<>();
        li.add("Rk");
        li.add("rai");
        li.add("pk");

        new Main().printList(li);

        // sort: capital letter > small letters

        li.sort(null);
        System.out.println("sorted list : "+li);

        // reverse: we use collection framework

        Collections.reverse(li);
        System.out.println("reverse order : "+li);



    }

    void printList(List<String> list){
        //Interface Iterators: An Iterator in Java is an object that allows you to
        // traverse through a collection (like ArrayList, LinkedList, HashSet, etc.) one element at a time.
        Iterator<String> data= list.listIterator();// Iterators can also be but instead we r usng listIterators bcz we will get some more methods
        while(data.hasNext()){
            System.out.println(data.next());
        }
    }
}
