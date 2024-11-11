package test;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de los objetos
        Motor motor1 = new Motor();
        motor1.numeroCilindros = 4;
        motor1.tipo = "gasolina";
        motor1.registro = 12345;

        Asiento asiento1 = new Asiento();
        asiento1.cambiarColor("rojo");

        Asiento asiento2 = new Asiento();
        asiento2.cambiarColor("verde");

        Asiento asiento3 = new Asiento();
        asiento3.cambiarColor("amarillo");

        // Crear un arreglo de asientos
        Asiento[] asientos = {asiento1, asiento2, asiento3};

        // Crear instancia de Auto y asignar valores
        Auto auto1 = new Auto();
        auto1.inicializarAuto("Modelo X", 25000, asientos, "Marca Y", motor1, 12345);

        // Mostrar la cantidad de asientos no nulos
        System.out.println("Cantidad de asientos no nulos: " + auto1.cantidadAsientos());

        // Verificar la integridad del auto
        System.out.println("Integridad del auto: " + auto1.verificarIntegridad());

        // Cambiar el registro del motor y verificar nuevamente la integridad
        motor1.cambiarRegistro(67890);
        System.out.println("Integridad del auto después de cambiar el registro del motor: " + auto1.verificarIntegridad());

        // Mostrar cantidad de autos creados
        System.out.println("Cantidad de autos creados: " + Auto.cantidadCreados);
    }
}
