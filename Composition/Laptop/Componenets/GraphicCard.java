package Composition.Laptop.Componenets;

public class GraphicCard {
    private String brand;
    private int series;
    private String memory;
    public GraphicCard() {
        this.brand = "Nvidia";
        this.series = 3100;
        this.memory = "6 gb";
    }
    public GraphicCard(String brand, int series, String memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }
    
    public String getBrand() {
        return brand;
    }
    public int getSeries() {
        return series;
    }
    public String getMemory() {
        return memory;
    }
    @Override
    public String toString() {
        return "GraphicCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
    }
    
    
}
