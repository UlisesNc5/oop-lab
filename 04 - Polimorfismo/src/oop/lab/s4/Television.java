package oop.lab.s4;

public class Television extends ElectricDevice implements MenuConfig {
    
    private String color;

    @Override
    public void turnOn() {
        System.out.println("Television enciende");
    }
    
    public void changeVolume(int volume) {
        System.out.println("Volumen cambiado a " + volume);
    }
    
    public void changeChannel(int channel) {
        System.out.println("Canal cambiado a " + channel);
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void selectEntry(String entry) {
        System.out.println("Entrada cambiada a: " + entry);
    }

    @Override
    public void changeBrightness(int brightness) {
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
