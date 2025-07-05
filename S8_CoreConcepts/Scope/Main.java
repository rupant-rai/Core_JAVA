package S8_CoreConcepts.Scope;

public class Main {
    public int i=55;// non static varibale

    public static void main(String[] args) {
        System.out.println(new Main().i);
    }
}

class Nain2 {
    public static int n=2;// Static varibale

    public static void main(String[] args) {
        System.out.println(n);
    }
}
