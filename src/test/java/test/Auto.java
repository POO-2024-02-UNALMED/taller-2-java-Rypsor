package test;

public class Auto {
    // Atributos públicos para acceso directo
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados = 0;  // Contador de autos creados

    // Constructor por defecto (sin parámetros)
    public Auto() {
        cantidadCreados++;  // Incrementar el contador de autos creados
    }

    // Método para inicializar los atributos
    public void inicializarAuto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
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
        if (motor == null || registro != motor.registro) {  // Acceder directamente a motor.registro
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

