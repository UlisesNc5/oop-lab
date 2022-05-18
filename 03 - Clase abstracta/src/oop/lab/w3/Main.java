package oop.lab.w3;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        Calculator calc = new Calculator();
        
        System.out.println("Television");
        tv.setBrand("Hitachi");
        System.out.println(tv.getBrand());
        tv.powerOn();
        tv.changeChannel(5);
        tv.changeVolume(20);
        System.out.println(tv.turnoff());
        
        System.out.println("Calculadora");
        calc.setBrand("Casio");
        System.out.println(calc.getBrand());
        calc.powerOn();
        System.out.println("Suma 2 + 6: " + calc.sum(2, 6));
        System.out.println("Resta 9 - 4: " + calc.sub(2, 4));
        System.out.println("Multiplicacion 3.5 * 2: " + calc.mul(3.5, 2));
        System.out.println("Division 9 / 4: " + calc.div(9, 4));
        calc.turnoff();
        
    }
    
}
