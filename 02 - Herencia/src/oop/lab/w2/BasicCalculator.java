package oop.lab.w2;

public class BasicCalculator extends Calculator {
    
    private String model;
    
    public double div(double a, double b) {
        return a / b;
    }
    
    public double mult(double a, double b) {
        return a * b;
    }

    public String getModelo() {
        return model;
    }

    public void setModelo(String model) {
        this.model = model;
    }
}
