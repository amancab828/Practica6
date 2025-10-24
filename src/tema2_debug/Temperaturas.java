package tema2_debug;

import java.util.Scanner;

/**
 * Programa con errores para practicar la depuración.
 * El programa pide una temperatura y muestra si hace frío, calor o temperatura templada.
 * Después, repite mientras el usuario quiera continuar.
 */
public class Temperaturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mostrarMensajeBienvenida(); // Falta poner punto y coma

        boolean continuar = true;

        while (continuar==true) { // Está mal puseta la condición
            double temperatura = pedirTemperatura(sc); // Falta poner punto y coma
            mostrarResultado(temperatura); // Falta poner punto y coma

            System.out.print("¿Desea introducir otra temperatura? (s/n): ");
            String respuesta = sc.next();

            if (respuesta == "n" || respuesta == "N") 
                continuar = false;
        }

        sc.close();  // Falta poner punto y coma
        System.out.println("Programa finalizado.");  // Falta poner punto y coma
    }

    public static void mostrarMensajeBienvenida() {
        System.out.println("Bienvenido al analizador de temperaturas."); // Falta poner punto y coma
        System.out.println("Este programa indica si hace frío, calor o está templado."); // Falta poner punto y coma
    }

    public static double pedirTemperatura(Scanner sc) {
        double t;
        do {
            System.out.print("Introduce la temperatura en grados: ");
            t = sc.nextDouble();
            if (t < -10 && t > 50) {
                System.out.println("Temperatura fuera del rango permitido (-10 a 50)."); // Falta poner punto y coma
            }
        } while (t < -10 && t > 50);
        return t;
    }

    public static void mostrarResultado(double temperatura) {
    	// Falta poner todos los corchetes de la condicional
        if (temperatura < 15) {
            System.out.println("Hace frío."); // Falta poner punto y coma
        }else if (temperatura >= 15 && temperatura < 30) {
            System.out.println("Temperatura templada."); // Falta poner punto y coma
        }else if (temperatura >= 30) {
            System.out.println("¡Hace mucho calor!"); // Falta poner punto y coma
        }else {
            System.out.println("Valor no reconocido."); // Falta poner punto y coma
        }
    }
}


