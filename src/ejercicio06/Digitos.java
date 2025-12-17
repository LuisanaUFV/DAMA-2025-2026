package ejercicio06;

import java.util.Scanner;

/*
 * Programa Java que solicite la carga de un número entre 0 y 999, y nos muestre
 * un mensaje de cuántos dígitos tiene el mismo.
 * Finalizar el programa cuando se cargue el valor 0.
 */

public class Digitos {

	public static void main(String[] args) {
       // ZONA DE DATOS
	   Scanner sc = new Scanner (System.in);
		// datos de entrada
		int numero = 0;
	   // datos de salida
		int numero_digitos = 0;
		
	   // ZONA DE INSTRUCCIONES
	   while ( numero != 0 ) {
		   System.out.println("Por favor, introduce un número entre 0 y 999: ");
		   numero = sc.nextInt();
			
		   // Comprobamos con condiciones si tiene 1, 2 o 3 dígitos 
		   if ( numero < 10 ) {
			   numero_digitos = 1;
		       System.out.println("El número tiene " + numero_digitos + " dígitos.");
		   } else if ( numero < 100 ) {
			   numero_digitos = 2;
			   System.out.println("El número tiene " + numero_digitos + " dígitos.");
		   } else if ( numero >= 100 ) {
			   numero_digitos = 3;
			   System.out.println("El número tiene " + numero_digitos + " dígitos.");
		   } 
	   }
		
		
		sc.close();
		System.out.println("Bye!!!!");
	
	}

}
