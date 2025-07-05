package Polymorphism.Example2.Animal.Bird;

public class Eagle extends Bird {

    public Eagle(boolean feather, boolean canFly) {
		super(feather, canFly);		
	}
		
	public String showInfo() {
		return "Eagle [feather=" + feather + ", canFly=" + canFly + ", heightInFeet=" + heightInFeet
		+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
    
}
