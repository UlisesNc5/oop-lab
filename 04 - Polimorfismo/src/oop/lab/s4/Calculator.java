package oop.lab.s4;

public class Calculator extends ElectricDevice implements StandardOperations{
    @Override
    public void turnOn() {
        System.out.println("Calculadora enciende");
    }
    
    @Override
    public double sum(double a, double b) {
        return a + b;
    }
    
    @Override
    public double sub(double a, double b) {
        return a - b;
    }
    
    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }    
}
