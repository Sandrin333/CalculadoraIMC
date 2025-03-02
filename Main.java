// Main.java
import java.util.Scanner;

/**
 * Clase principal para ejecutar el programa de cálculo de IMC.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Crear objeto Persona y calcular IMC
        Persona persona = new Persona(peso, altura);
        System.out.println(persona.obtenerMensajeIMC());

        scanner.close();
    }
}