package test;

public class Motor {
    // Atributos públicos para acceso directo
    public int numeroCilindros;
    public String tipo;
    public int registro;

    // Constructor sin parámetros
    public Motor() {}

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        if (nuevoTipo.equals("electrico") || nuevoTipo.equals("gasolina")) {
            this.tipo = nuevoTipo;
        }
    }
}




