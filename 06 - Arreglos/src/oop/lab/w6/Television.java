package oop.lab.w6;

public class Television extends ElectricDevice implements MenuConfiguration {
    
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

    @Override
    public void selectEntry(String entry) {
        System.out.println("Entrada cambiada a: " + entry);
    }

    @Override
    public void setBrightness(int brightness) {
        System.out.println("Brillo cambiado a " + brightness);
    }

    @Override
    public void surroundSound(boolean activated) {
        if (activated == true)
            System.out.println("Sonido surround activado");
        else
            System.out.println("Sonido surround desactivado");
    }
    
}
