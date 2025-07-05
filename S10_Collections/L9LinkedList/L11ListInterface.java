package S10_Collections.L9LinkedList;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class L11ListInterface {
    public static void main(String[] args) {
        LinkedList<String> li= new LinkedList<>();
        li.add("rk");
        li.add("rai");
        li.add("pk");

        ArrayList<String> al= new ArrayList<>();
        al.add("rk");
        al.add("rai");
        al.add("pk");

        new L11ListInterface().printList(li);
        //new L11ListInterface().printList(al);// this will be wrong as we are passing the wrong list
        //to cure this problem we can use "List" Interface as a parameter instead of arrayList or linkedList
        new L11ListInterface().printList(al); // this will also work bcz , in the function we are using List intergface instead of class Linkedlist or ArrayList
        // List Interfcae contains all type of the lists
    }

    // public void printList(LinkedList<String> list){
    //     for ( String name: list){
    //         System.out.println(name);
    //     }
    // }

    public void printList(List<String> list){
        for ( String name: list){
            System.out.println(name);
        }
    }
}
