package Composition.Laptop.Componenets;

public class Processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequenecy;
    private String minFrequency;
    private String maxFrequency;
    public Processor() {
        this.brand = "intel";
        this.series = "11080u";
        this.generation = 11;
        this.cores = 4;
        this.threads = 4;
        this.cacheMemory = "5 mb";
        this.frequenecy = "2.56ghz";
        this.minFrequency = "2.4ghz";
        this.maxFrequency = "3.16ghz";
    }

    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
            String frequenecy, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequenecy = frequenecy;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }
    

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGeneration() {
        return generation;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public String getFrequenecy() {
        return frequenecy;
    }

    public String getMinFrequency() {
        return minFrequency;
    }

    public String getMaxFrequency() {
        return maxFrequency;
    }

    @Override
    public String toString() {
        return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
                + ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequenecy=" + frequenecy
                + ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
    } 
}
