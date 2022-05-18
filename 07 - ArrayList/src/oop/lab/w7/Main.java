package oop.lab.w7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transport> tr = new ArrayList<>();
        tr.add(new Car(60, 0, "Chevy", "Sonic"));
        tr.add(new Bus(40, 15, "Dina", "Buller"));
        tr.add(new Plane(200, 5, "Boeing", "747"));
        tr.add(new Helicopter(150, 25, "Bell", "204"));
        tr.add(new Ship(100, 20, "Azimut", "45"));
        
        for (Transport tra : tr) {
            System.out.println("Clase: " + tra.getClass().toString());
            tra.powerOn();
            
            tra.accelerate();
            if (tra.gas <= 10) { // Rellenar gasolina e intentar otra vez
                tra.gas += 15;
                tra.accelerate();
            }
            
            System.out.println("Marca: " + tra.getbrand());
            System.out.println("Modelo: " + tra.getmodel());
            
            if (tra instanceof Breaks iFrenos) { // instanceof pattern
                System.out.println(iFrenos.breaks());
            }
            
            if (tra instanceof ElectricSystem iSistemaElectrico) {
                System.out.println(iSistemaElectrico.turnLightsOn());
                System.out.println(iSistemaElectrico.lowersWindows());
            }
            
            if (tra instanceof Fly iVolar) {
                System.out.println(iVolar.fly());
            }
            
            if (tra instanceof Car automovil) {
                automovil.turnRadioOn();
            }
            
            if (tra instanceof Bus autobus) {
                autobus.openDoors();
            }
            
            if (tra instanceof Plane avion) {
                avion.liftOff();
            }
            
            if (tra instanceof Helicopter helicoptero) {
                helicoptero.descend();
            }
            
            if (tra instanceof Ship barco) {
                barco.anchor();
            }
            
            System.out.println(""); // Imprime linea vacia para separar
        }
    }
    
}
