package Operaciones_aritmetricas;

/**
 *
 * @author Gercray
 */
public class Matematica {

    public static void main(String[] args) {
         double num1 = 10, num2 = 5;

        System.out.println("Suma: " + Operaciones_aritmetricas.suma(num1, num2));
        System.out.println("Resta: " + Operaciones_aritmetricas.resta(num1, num2));
        System.out.println("Multiplicación: " + Operaciones_aritmetricas.multiplicacion(num1, num2));
        System.out.println("División: " + Operaciones_aritmetricas.division(num1, num2));
        System.out.println("División por cero: " + Operaciones_aritmetricas.division(num1, 0));
    }
}
