package S9_Arrays;

public class Temp {
    public static void main(String[] args) {
        String[] names= {"RK", "rai"};
        System.out.println(names);// reference or base address
        System.out.println(names[0]);
        //now passing the array in the method as parameter
        Temp temp= new Temp();
        temp.display(names);
        // some updation is domne in the method - then the array will also be update for the outside world also
        System.out.println(names[0]);// PK
    }

    public void display(String[] names){
        System.out.println(names[0]);
        names[0]="PK";
    }

}
