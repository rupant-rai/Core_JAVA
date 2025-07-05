//ArrayList continous
package S10_Collections.S140ArrayLists;
import java.util.*;
public class S141 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("rupant");
        al.add("rai");
        al.add( "shivam");
        al.add( "SINGH");
        System.out.println(al.remove("SNGH"));// false
        System.out.println(al.remove("SINGH"));// true

        System.out.println(al.set(0, "priyanshu"));// rupant will be replaced with priyanshu
        System.out.println(al);// updated list will get printed

        //if we want to search what is the index of any object then
        System.out.println(al.indexOf("shivam"));// 2 
        System.out.println(al.indexOf("rupant"));//-1 as rupant do not exist in the al at current


    }   
}
