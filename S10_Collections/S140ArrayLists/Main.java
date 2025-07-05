package S10_Collections.S140ArrayLists;
import java.util.*;

public class  Main{
    public static void main( String args[]){
        ArrayList<String> al= new ArrayList<>();
        al.add("rupant");
        al.add("rai");
        al.add( "shivam");
        al.add( "SINGH");
        System.out.println(al);
        for(String temp: al){
            System.out.println(temp);
        }

        System.out.println(al.get(3));
        al.remove("SINGH");
        System.out.println(al);
    }
}
