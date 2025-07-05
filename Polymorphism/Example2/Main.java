package Polymorphism.Example2;

import java.util.ArrayList;
import java.util.List;

import Polymorphism.Example2.Animal.Animal;
import Polymorphism.Example2.Animal.Bird.Bird;
import Polymorphism.Example2.Animal.Bird.Eagle;
import Polymorphism.Example2.Animal.Fish.Eel;
import Polymorphism.Example2.Animal.Reptile.Crocodile;
import Polymorphism.Example2.Animal.Reptile.Reptile;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal animal= new Animal();
        Reptile reptile = new Reptile();
        Animal croc = new Crocodile();
        Animal eel = new Eel();
        Bird eagle = new Eagle(false, false);
    
        animals.add(animal);
        animals.add(reptile);
        animals.add(croc);
        animals.add(eel);
        animals.add(eagle);
        listAnimals(animals);
    }
    private static void listAnimals(List<Animal> animals) {
		for(Animal animal: animals){
			System.out.println(animal.showInfo());
		}
	}
}
