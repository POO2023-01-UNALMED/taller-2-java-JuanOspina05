package test;

import java.util.Arrays;

public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public void cambiarColor(String color) {
        if (Arrays.asList("rojo", "verde", "amarillo", "negro", "blanco").contains(color)) {
            this.color = color;
        }
    }
}

