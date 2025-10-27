package tema2_debug;
import java.util.Scanner;


/*Programa con errores para practicar la depuración. El programa pide una temperatura y muestra si hace frío, calor o temperatura
templada. Después, repite mientras el usuario quiera continuar.*/


public class Temperaturas {
	
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       
       mostrarMensajeBienvenida(); // AMC20252410: Falta poner punto y coma
       
       boolean continuar = true;
       while (continuar==true) { // AMC20252410: Está mal puseta la condición
           double temperatura = pedirTemperatura(sc); // AMC20252410: Falta poner punto y coma
           mostrarResultado(temperatura); // AMC20252410: Falta poner punto y coma
           System.out.print("¿Desea introducir otra temperatura? (s/n): ");
           String respuesta = sc.next();
           if (respuesta.charAt(0) == 'n' || respuesta.charAt(0) == 'N') { // AMC20252410: Cambiamos a char, y le ponemos las comillas simples
               continuar = false;
       	   }
       }
       sc.close();  // AMC20252410: Falta poner punto y coma
       System.out.println("Programa finalizado.");  // AMC20252410: Falta poner punto y coma
   }
   
   
   public static void mostrarMensajeBienvenida() {
       System.out.println("Bienvenido al analizador de temperaturas."); // AMC20252410: Falta poner punto y coma
       System.out.println("Este programa indica si hace frío, calor o está templado."); // AMC20252410: Falta poner punto y coma
   }
   
   
   public static double pedirTemperatura(Scanner sc) {
       double t;
       do {
           System.out.print("Introduce la temperatura en grados: ");
           t = sc.nextDouble();
           if (t < -10 || t > 50) { // AMC20252410: Cambiamos && por ||, ya que si no, es una condición imposible
               System.out.println("Temperatura fuera del rango permitido (-10 a 50)."); // Falta poner punto y coma
           }
       } while (t < -10 || t > 50); // AMC20252410: Cambiamos && por ||, ya que si no, es una condición imposible
       return t;
   }
   
   
   public static void mostrarResultado(double temperatura) {
   	// AMC20252410: Pongo todos los corchetes de la condicional, para mantener una estructura limpia, además por si se da la opción de añadir más instrucciones en una condicion
       if (temperatura < 15) {
           System.out.println("Hace frío."); // AMC20252410: Falta poner punto y coma
       } else if (temperatura >= 15 && temperatura < 30) {
           System.out.println("Temperatura templada."); // AMC20252410: Falta poner punto y coma
       } else if (temperatura >= 30) {
           System.out.println("¡Hace mucho calor!"); // AMC20252410: Falta poner punto y coma
       } else {
           System.out.println("Valor no reconocido."); // AMC20252410: Falta poner punto y coma
       }
   }
}

