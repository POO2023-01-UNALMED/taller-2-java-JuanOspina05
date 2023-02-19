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
		
		if (this.registro != this.motor.registro) {
			return "Las piezas no son originales";}
		
		else {
			for (Asiento a : this.asientos) {
				if (a == null) {
					continue;
				}
				else {
					if (a.registro != this.registro) {
						return "Las piezas no son originales";
					}
				}			
			}	
		}
		return "Auto original";
	}

}

