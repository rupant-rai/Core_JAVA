package Polymorphism.Example2.Animal.Reptile;

public class Crocodile extends Reptile {
    public Crocodile() {
		super();
		egg = "Hard Shelled";
	}

	public String showInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
}
