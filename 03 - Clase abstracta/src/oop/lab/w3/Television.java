package oop.lab.w3;

public class Television extends ElectricDevice{
    
    private String color;

    @Override
    public void powerOn() {
        System.out.println("Television enciende");
    }
    
    public void changeVolume(int volume) {
        System.out.println("Volumen cambiado a " + volume);
    }
    
    public void changeChannel(int channel) {
        System.out.println("Canal cambiado a " + channel);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
