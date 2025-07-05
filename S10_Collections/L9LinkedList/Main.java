package S10_Collections.L9LinkedList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> li= new LinkedList<>();
        li.add("rk");
        li.add("rai");
        li.add("pk");

        System.out.println(li);

        // operations

        li.add("john");
        System.out.println(li);

        li.add(2,"mike");// mike will be added at index 2
        System.out.println(li);

        li.set(3,"qk");// update the element at index 3 with qk
        System.out.println(li);

        li.remove(0);// element at index 0 will be removed from list
        System.out.println(li);


    }
}
