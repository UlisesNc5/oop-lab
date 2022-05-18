package oop.lab.w6;

public class Calculator extends ElectricDevice implements StandardOperations{
    
    @Override
    public void powerOn() {
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
    public double mult(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }
}
