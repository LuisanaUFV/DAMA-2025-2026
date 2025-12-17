package ejemplo01;
   /*
    * Programa Java que compruebe si el sueldo de una persona es superior a
    * 3000€ y muestre un mensaje por pantalla indicando que debe abonar
    * impuestos.
    */

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
        // ZONA DE DATOS: Declaración e inicialización de constantes y variables
		// Datos entrada
		int sueldo = 0;
		Scanner teclado = new Scanner(System.in);
		
		// Datos de salida
		
		
		// ZONA DE INSTRUCCIONES
		// Trabajamos ya con Scanner
		//sueldo = 3000;
		System.out.println("Por favor, introduce el sueldo:");
		sueldo = teclado.nextInt();
		
		// Condición
		if ( sueldo >= 3000 ) {
	      System.out.println("Debes pagar impuestos!!!!");		
	    }
		teclado.close();
	    System.out.println("Bye!!!!");
	}

}
