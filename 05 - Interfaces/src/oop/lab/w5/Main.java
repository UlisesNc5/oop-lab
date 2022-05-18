/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.lab.w5;

/**
 *
 * @author A
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\nClase Automovil");
        Car topaz = new Car();
        
        topaz.setbrand("BMW");
        topaz.setModel("Azul");
        System.out.println(topaz.getbrand());
        System.out.println(topaz.getModel());
        System.out.println(topaz.powerOn(0));
        System.out.println(topaz.powerOn(3));
        System.out.println(topaz.turnLightsOn());
        System.out.println(topaz.turnLightsOff());
        System.out.println(topaz.run(0));
        System.out.println(topaz.run(2));
        System.out.println(topaz.breaks());
        System.out.println(topaz.reverse(1));
        System.out.println(topaz.reverse(2));
        System.out.println(topaz.powerOff());
        
        System.out.println("\nClase abstracta");
        Transport topazGuia = new Car();
        
        System.out.println(topazGuia.powerOn(3));
        topazGuia.setbrand("Guia");
        topazGuia.setModel("Guia");
        System.out.println(topazGuia.getbrand());
        System.out.println(topazGuia.getModel());
        System.out.println(topazGuia.powerOn(2));
        System.out.println(topazGuia.powerOff());
        
        System.out.println("\nInterfaz ISistemaElectrico");
        ElectricSystem topazE = new Car();
        
        System.out.println(topazE.turnLightsOn());
        System.out.println(topazE.turnLightsOff());
        
        System.out.println("\nAvion");
        Plane condor = new Plane();
        
        condor.setbrand("Boeing");
        condor.setModel("384");
        System.out.println(condor.getbrand());
        System.out.println(condor.getModel());
        System.out.println(condor.powerOn(2));
        System.out.println(condor.fly());
        System.out.println(condor.despegar());
        System.out.println(condor.despegar());
        System.out.println(condor.fly());
        System.out.println(condor.turnLightsOn());
        System.out.println(condor.turnLightsOff());
        System.out.println(condor.powerOff());
        
        System.out.println("\nInterfaz ISistemaVuelo");
        FlySystem condorF = new Plane();
        
        System.out.println(condorF.fly());
    }
    
}
