package oop.lab.w5;

public class Plane extends Transport implements ElectricSystem, FlySystem {

    private boolean flying;
    
    public String despegar() {
        if (!flying) {
            flying = true;
            return "El avion ha despegado";
        }else 
            return "El avion ya esta en el aire";
    }
    
    @Override
    public String powerOn(double gas) {
        if (gas > 0)
            return "Avion encendido";
        else
            return "Error, no hay gasolina";
    }

    @Override
    public String powerOff() {
        return "Avion apagado";
    }

    @Override
    public String turnLightsOn() {
        return "Luces del avion encendidas";
    }

    @Override
    public String turnLightsOff() {
        return "Luces del avion apagadas";
    }

    @Override
    public String fly() {
        if (flying)
            return "El avion ha avanzado en el aire";
        else
            return "Error: El avion no esta en el aire";
    }
    
}
