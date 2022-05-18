package oop.lab.w3;

public class Calculator extends ElectricDevice {

    @Override
    public void powerOn() {
        System.out.println("Calculadora enciende");
    }
    
    public double sum(double a, double b) {
        return a + b;
    }
    
    public double sub(double a, double b) {
        return a - b;
    }
    
    public double div(double a, double b) {
        return a / b;
    }
    
    public double mul(double a, double b) {
        return a * b;
    }
}
