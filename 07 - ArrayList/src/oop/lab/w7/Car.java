package oop.lab.w7;

public class Car extends Transport implements Breaks, ElectricSystem{

    public Car(int speed, int gas, String brand, String model) {
        super(speed, gas, brand, model);
    }
    
    public void turnRadioOn() {
        System.out.println("Radio encendido");
    }

    @Override
    public void powerOn() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String breaks() {
        return "Automovil frenado";
    }

    @Override
    public String turnLightsOn() {
        return "Luces del automovil prendidas";
    }

    @Override
    public String lowersWindows() {
        return "Vidrios del automovil cambiados de posicion";
    }
    
}
