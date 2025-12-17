package ejemplo01;
   /*
    * Programa Java que compruebe si el sueldo de una persona es superior a
    * 3000€ y muestre un mensaje por pantalla indicando que debe abonar
    * impuestos.
    */

public class Sueldo {

	public static void main(String[] args) {
        // ZONA DE DATOS: Declaración e inicialización de constantes y variables
		// Datos entrada
		int sueldo = 0;
		
		// Datos de salida
		
		
		// ZONA DE INSTRUCCIONES
		// Simulamos leer dato de entrada
		sueldo = 3000;
		
		// Condición
		if ( sueldo >= 3000 ) {
	      System.out.println("Debes pagar impuestos!!!!");		
	    }
	    System.out.println("Bye!!!!");
	}

}
