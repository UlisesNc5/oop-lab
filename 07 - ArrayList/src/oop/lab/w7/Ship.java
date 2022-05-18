package oop.lab.w7;

public class Ship extends Transport implements ElectricSystem{

    public Ship(int speed, int gas, String brand, String model) {
        super(speed, gas, brand, model);
    }

    public void anchor() {
        System.out.println("El barco ha anclado");
    }
    
    @Override
    public void powerOn() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String turnLightsOn() {
        return "Luces del barco prendidas";
    }

    @Override
    public String lowersWindows() {
        return "Vidrios del barco cambiados de posicion";
    }
    
}
