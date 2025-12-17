package ejemplo02;

 /*
  * Programa Java que compruebe de dos números enteros distintos cual es el
  * mayor y lo muestre por pantalla.
  */

public class ComprobarMayor {

	public static void main(String[] args) {
		// ZONA DE DATOS: Declaración e inicialización de constantes y variables
		// Datos de entrada
	    int numero1 = 0, numero2 = 0;	
		// Datos de salida
			
		// ZONA DE INSTRUCCIONES
	    // Simulamos leer datos de entrada
	    numero1 = 20;
	    numero2 = 400;
	    
	    // Condición
	    if ( numero1 > numero2 ) {
	    	System.out.println(numero1 + " es mayor que " + numero2);
	    } else if ( numero2 == numero1){
	    	System.out.println(numero1 + " es igual a " + numero2);
	    } else if ( numero1 < numero2){	
	    	System.out.println(numero1 + " es menor que " + numero2);
	    } else {
	    	System.out.println("Algo raro pasa!!!!");
	    }
	    
	    System.out.println("Bye!!!!");
	}
}
