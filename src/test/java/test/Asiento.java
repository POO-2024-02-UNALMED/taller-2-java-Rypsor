package test;

public class Asiento {
    // Atributos públicos para acceso directo
    public String color;
    public int precio;
    public int registro;

    // Constructor sin parámetros
    public Asiento() {}

    public void cambiarColor(String nuevoColor) {
        if (nuevoColor.equals("rojo") || nuevoColor.equals("verde") || 
            nuevoColor.equals("amarillo") || nuevoColor.equals("negro") || 
            nuevoColor.equals("blanco")) {
            this.color = nuevoColor;
        }
    }
}
