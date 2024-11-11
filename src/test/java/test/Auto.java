package test;

public class Auto {
	private String modelo;
    private int precio;
    private Asiento[] asientos;
    private String marca;
    private Motor motor;
    private int registro;
    private static int cantidadCreados = 0;

    public Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public int getRegistro() {
        return registro;
    }

    public static int getCantidadCreados() {
        return cantidadCreados;
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
        if (motor == null || registro != motor.getRegistro()) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.getRegistro() != registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }

}
