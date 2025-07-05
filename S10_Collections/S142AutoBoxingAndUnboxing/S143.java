package S10_Collections.S142AutoBoxingAndUnboxing;

import java.util.*;
public class S143 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(234);// autoboxing: means we are able to use primitive datatype in collections
        //automatic conversion of wrapper objectrs in primitive datatype
        al.add(123);
        System.out.println(al.get(0));// auto unboxing: automatic conversion of primitive dataype into wrapper objects


        // both auto boxing and unboxing can be done automatically when we are using inbuilt wrapper class 
        // but in case of user defined wrapper class:- we have to do it manually

        ArrayList<IntWrapper> list= new ArrayList<>();
        list.add(new IntWrapper(65)); // manual boxing
        //System.out.println(list.get(0));// will not show errror :- instead we will be getting the object rather than the value

        //System.out.println(list.get(0).getNum());// manual unboxing

        // section 144

        ArrayList<Double> li= new ArrayList<>();
        li.add(25.5);// auto boxing
        li.add(Double.valueOf(25.5));// behind the scence of the auto boxing , internally the java will be implementing this
        System.out.println(li.get(0));
    } 
}
class IntWrapper{
    public int num;

    public IntWrapper(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
