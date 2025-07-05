package Encapasulation;

public class Main {
    public static void main(String args[]){
        Person person = new Person("Rk",21, "Male");
        person.setName("MK");
        person.setAge(-1000);// out of the defined range then no updation will be done 
        person.setAge(25);// will be updated as it is the defined range of the setter
        System.out.println(person);
    }
}
