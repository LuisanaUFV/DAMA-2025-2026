package ejercicio07;
  /*
   * Programa Java que imprima en pantalla los números del 1 al 100. 
   * Como se conoce de antemano el número de repeticiones (100) la mejor opción de bucle es el for.
   */
public class BucleFor {

	public static void main(String[] args) {
		System.out.println("Primer For:");
		for (int j = 1 ;  j <= 100 ; j++) {
			System.out.print(j + " ");
		}
		System.out.println("\nSegundo For:");
		for (int j = 0 ;  j < 100 ; j++) {
			System.out.print(( j + 1 ) + " ");
		}
		System.out.println();
		System.out.println("Bye");

	}

}
