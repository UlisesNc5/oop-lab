package oop.lab.w7;

public class Bus extends Transport implements Breaks, ElectricSystem{

    public Bus(int speed, int gas, String brand, String model) {
        super(speed, gas, brand, model);
    }
    
    public void openDoors() {
        System.out.println("Se han abierto las puertas del autobus");
    }

    @Override
    public void powerOn() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String breaks() {
        return "Autobus frenado";
    }

    @Override
    public String turnLightsOn() {
        return "Luces del autobus prendidas";
    }

    @Override
    public String lowersWindows() {
        return "Vidrios del autobus cambiados de posicion";
    }
    
}
