package oop.lab.w7;

public class Plane extends Transport implements Fly {

    public Plane(int speed, int gas, String brand, String model) {
        super(speed, gas, brand, model);
    }

    public void liftOff() {
        System.out.println("El avion ha despegado");
    }
    
    @Override
    public void powerOn() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String fly() {
        return "Avion avanza en el aire";
    }
    
}
