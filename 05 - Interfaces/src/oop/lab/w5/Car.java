package oop.lab.w5;

public class Car extends Transport implements ElectricSystem, BreaksSystem{
    
    public String run(double gas) {
        if (gas > 1)
            return "Avanzado";
        else
            return "No se puede avanzar, no hay gasolina";
    }
    
    public String reverse(double gas) {
        if (gas > 1)
            return "Reversa";
        else
            return "No se puede ir en reversa, no hay gasolina";
    }
    
    @Override
    public String powerOn(double gas) {
        if (gas > 0)
            return "Auto Encendido";
        else
            return "No hay gasolina";
    }

    @Override
    public String powerOff() {
        return "Auto Apagado";
    }
    
    @Override
    public String turnLightsOn() {
        return "Luces del automovil encendidas";
    }

    @Override
    public String turnLightsOff() {
        return "Luces del automovil apagadas";
    }

    @Override
    public String breaks() {
        return "Frenos del auto activados";
    }
    
}
