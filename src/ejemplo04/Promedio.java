package ejemplo04;

 /* Programa Java que dadas tres notas diferentes de un alumno, calcule el
  * promedio e imprima alguno de los siguientes mensajes:
  * • Si el promedio es >=7 mostrar "Promocionado".
  * • Si el promedio es >=4 y <7 mostrar "Regular".
  * • Si el promedio es <4 mostrar "Suspenso".
  *
  */
public class Promedio {

	public static void main(String[] args) {
		// ZONA DE DATOS: Declaración e inicialización de constantes y variables
		// Datos de entrada
		int nota1 = 0, nota2 = 0, nota3 = 0; 
		// Datos de salida
		float promedio = 0;
		
		// ZONA DE INSTRUCCIONES
		// Simulamos leer datos de entrada
		nota1 = 2;
		nota2 = 9;
		nota3 = 5;
		
		// Calculamos el promedio
		promedio = ( nota1 + nota2 + nota3 ) / 3;
		System.out.println("Promedio: " + promedio);
		// Condiciones --> Estructura if anidada
		if  ( promedio >= 7 ) {
			System.out.println("Promedio " + promedio + " es PROMOCIONADO"); 
		} 
		if ( ( promedio >= 4 ) && ( promedio < 7 ) ) {
			System.out.println("Promedio " + promedio + " es REGULAR"); 
		} 
		if ( promedio < 4 ) {
			System.out.println("Promedio " + promedio + " es SUSPENSO"); 	
		} else {
			System.out.println("ALGO RARO HA OCURRIDO!!!");
		}
		
		System.out.println("Bye!!!");
		
		
	}

}
