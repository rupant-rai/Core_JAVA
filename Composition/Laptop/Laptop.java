package Composition.Laptop;

import Composition.Laptop.Componenets.GraphicCard;
import Composition.Laptop.Componenets.Processor;

public class Laptop {
    private float screen;
    private Processor processor;
    private String ram;
    private String harddrive;
    private GraphicCard garaphicCard;
    private String opticalDrive;
    private String keyboard;
    public Laptop() {
        this.screen = 15.6f;
        this.processor = new Processor();
        this.ram = "16gb";
        this.harddrive = "2tb";
        this.garaphicCard = new GraphicCard();
        this.opticalDrive = "multiLayer";
        this.keyboard = "backlight";
    }
    public Laptop(float screen, Processor processor, String ram, String harddrive, GraphicCard garaphicCard,
            String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.harddrive = harddrive;
        this.garaphicCard = garaphicCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    public float getScreen() {
        return screen;
    }
    public Processor getProcessor() {
        return processor;
    }
    public String getRam() {
        return ram;
    }
    public String getHarddrive() {
        return harddrive;
    }
    public GraphicCard getGaraphicCard() {
        return garaphicCard;
    }
    public String getOpticalDrive() {
        return opticalDrive;
    }
    public String getKeyboard() {
        return keyboard;
    }
    @Override
    public String toString() {
        return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", harddrive=" + harddrive
                + ", garaphicCard=" + garaphicCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
    }
    
    
}
