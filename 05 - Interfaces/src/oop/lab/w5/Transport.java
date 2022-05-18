package oop.lab.w5;

public abstract class Transport {
    
    private String brand;
    private String model;
    
    public abstract String powerOn(double gas);
    public abstract String powerOff();

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
}
