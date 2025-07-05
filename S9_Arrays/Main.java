package S9_Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names= {"Rupant", "Rai"};
        System.out.println(names);// we will get the base addresss of the particular array element
        System.out.println(names[0]);

        // another way of array creation 

        String[] names2= new String[2];
        names2[0]= "PRiyanshu";
        names2[1]= "rai";

        //another way

        String[] names3;
        names3= new String[2];
        names3[0]= "rk";
        names3[1]="rai";

        int[] id;
        id= new int[2];
        id[0]=1;
        id[1]=2;

        float[] f;
        //f={2.5f, 3.4f};// we cannnot do this as we have to make object for the reference
        f= new float[2];
        System.out.println(f[0]);//0.0

        double[] d= {123,23.4354353, 34.5};
        System.out.println(d[0]);//123.0

        float[] f2= {123,23.4354353f, 34.5f};
        System.out.println(d[0]);

        // for each loop

        for ( String name: names){
            System.out.println(name);
        }

    }
    
    
}
