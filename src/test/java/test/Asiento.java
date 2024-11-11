package test;

public class Asiento {
    private String color;
    private int precio;
    private int registro;

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public String getColor() {
        return color;
    }

    public void cambiarColor(String nuevoColor) {
        if (nuevoColor.equals("rojo") || nuevoColor.equals("verde") || 
            nuevoColor.equals("amarillo") || nuevoColor.equals("negro") || 
            nuevoColor.equals("blanco")) {
            this.color = nuevoColor;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public int getRegistro() {
        return registro;
    }
}
