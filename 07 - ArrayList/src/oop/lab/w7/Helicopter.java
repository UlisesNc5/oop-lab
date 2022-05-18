package oop.lab.w7;

public class Helicopter extends Transport implements Fly {

    public Helicopter(int i, int i1, String string, String string1) {
        super(i, i1, string, string1);
    }
    
    public void descend() {
        System.out.println("El helicoptero ha descendido");
    }
    
    @Override
    public void powerOn() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String fly() {
        return "El helicoptero avanza de posicion";
    }
    
}
