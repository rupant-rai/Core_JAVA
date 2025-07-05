package S10_Collections.S144Stack;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack <Integer> st= new Stack<>();
        //stack works on LIFO
        // it extends the vector class 
        // it means we have vector class as the base class of the stack class

        st.push(25);
        st.push(3);
        st.push(223);
        st.push(252);
        st.push(251);

        System.out.println(st);

        // methods
        System.out.println(st.isEmpty());
        System.out.println(st.search(25));// 1 indexed
        System.out.println(st.pop());// top element is removed
        System.out.println(st);
        int x= st.search(252);// return the position in lifo fashon : 1
        System.out.println(x);
        int y= st.indexOf(252);// we will get the actual index
        System.out.println(y);
        System.out.println(st.get(3));// 252
    }
}
