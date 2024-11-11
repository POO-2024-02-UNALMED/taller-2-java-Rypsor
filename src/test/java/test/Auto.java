package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados = 0;  // Esto debe incrementarse cuando se crea un Auto

    public Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;  // Incrementar el contador al crear un Auto
    }

    public int cantidadAsientos() {
        int contador = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                contador++;
            }
        }
        return contador;
    }

    public String verificarIntegridad() {
        if (motor == null || registro != motor.registro) {  // Cambiado a motor.registro
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
