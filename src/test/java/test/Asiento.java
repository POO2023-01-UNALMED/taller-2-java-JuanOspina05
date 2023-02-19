package test;

import java.util.Arrays;

public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color) {
        if (Arrays.asList("rojo", "verde", "amarillo", "negro", "blanco").contains(color)) {
            this.color = color;
        }
    }

    public int getRegistro() {
        return registro;
    }

    
}

