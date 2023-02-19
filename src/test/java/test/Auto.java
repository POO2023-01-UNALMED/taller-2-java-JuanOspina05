package test;

import java.util.Arrays;

public class Auto{
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public Auto() {
        cantidadCreados++;
    }


    public int cantidadAsientos() {
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public String verificarIntegridad() {
        int registro_auto = this.registro;
        int registro_motor = this.motor.getRegistro();
        int[] registro_asientos = new int[this.asientos.length];
        int index = 0;
        for (Asiento asiento : this.asientos) {
            if (asiento != null) {
                registro_asientos[index] = asiento.getRegistro();
                index++;
            }
        }
        if (registro_auto == registro_motor && Arrays.stream(registro_asientos).allMatch(registro -> registro == registro_auto)) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }

}

