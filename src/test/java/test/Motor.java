package test;

public class Motor {
	private int numeroCilindros;
    private String tipo;
    private int registro;

    public Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public int getRegistro() {
        return registro;
    }

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        if (nuevoTipo.equals("electrico") || nuevoTipo.equals("gasolina")) {
            this.tipo = nuevoTipo;
        }
    }

}



