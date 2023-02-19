package test;

public class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro;
    
    public Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }
    
    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }
    
    public void asignarTipo(String tipo) {
        if (tipo.equals("electrico") || tipo.equals("gasolina")) {
            this.tipo = tipo;
        }
    }

}
