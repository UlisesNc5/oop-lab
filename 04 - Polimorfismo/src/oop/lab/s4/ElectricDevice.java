package oop.lab.s4;

public abstract class ElectricDevice {
    public String getModel() {
        return model;
    }

    public void setModelo(String model) {
        this.model = model;
    }
    
    private String brand;
    private String model;
    
    public abstract void turnOn();
    
    public String powerOff() {
        return "Dispositivo apagado";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
