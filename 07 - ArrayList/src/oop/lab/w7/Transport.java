package oop.lab.w7;

public abstract class Transport {
    public int speed, gas;
    
    private final String brand, model;
    
    public Transport(int speed, int gas, String brand, String model) {
        this.speed = speed;
        this.gas = gas;
        this.brand = brand;
        this.model = model;
    }
    
    public void accelerate() {
        if (gas > 10)
            System.out.println("Velocidad: " + speed);
        else
            System.out.println("No hay suficiente gasolina");
    }
    
    public abstract void powerOn();

    public String getbrand() {
        return brand;
    }
    
    public String getmodel() {
        return model;
    }
}
