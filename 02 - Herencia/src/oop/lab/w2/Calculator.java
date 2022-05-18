package oop.lab.w2;

public class Calculator {    
    private String brand;
    
    public double sum(double a, double b) {
        return a + b;
    }
    
    public double sub(double a, double b) {
        return a - b;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
