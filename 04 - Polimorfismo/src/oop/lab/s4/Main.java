package oop.lab.s4;

public class Main {

    public static void main(String[] args) {
        Television tv = new Television();
        Calculator calc = new Calculator();
        ScientificCalculator calcSc = new ScientificCalculator();
        
        System.out.println("Television");
        tv.setBrand("Hitachi");
        System.out.println(tv.getBrand());
        
        tv.turnOn();
        tv.changeChannel(5);
        tv.changeVolume(20);
        System.out.println(tv.powerOff());
        
        tv.changeBrightness(50);
        tv.selectEntry("HDMI");
        tv.surroundSound(true);
        tv.surroundSound(false);
        
        System.out.println("\nCalculadora Basica");
        calc.setBrand("Casio");
        System.out.println(calc.getBrand());
        calc.setModelo("2022B");
        System.out.println(calc.getModel());
        
        calc.turnOn();
        System.out.println("Suma 2 + 6: " + calc.sum(2, 6));
        System.out.println("Resta 9 - 4: " + calc.sub(2, 4));
        System.out.println("Multiplicacion 3.5 * 2: " + calc.mul(3.5, 2));
        System.out.println("Division 9 / 4: " + calc.div(9, 4));
        calc.powerOff();
        
        System.out.println("\nCalculadora Cientifica");
        calcSc.setBrand("Casio");
        System.out.println(calcSc.getBrand());
        calcSc.setModelo("2022C");
        System.out.println(calcSc.getModel());
        
        calcSc.turnOn();
        System.out.println("Suma 2 + 6: " + calcSc.sum(2, 6));
        System.out.println("Resta 9 - 4: " + calcSc.sub(2, 4));
        System.out.println("Multiplicacion 3.5 * 2: " + calcSc.mul(3.5, 2));
        System.out.println("Division 9 / 4: " + calcSc.div(9, 4));
        System.out.println("Raiz de 64: " + calcSc.root(64));
        System.out.println("Convertir a porcentaje 0.56: " + calcSc.percentage(0.56));
        calcSc.powerOff();
    }
    
}
