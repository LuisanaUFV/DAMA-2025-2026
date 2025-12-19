package ejercicio05;

import java.util.Scanner;

/*
  * Programa Java que determine el día de la semana en función de un número del 1 al 7
  * MEJORAS EN COMENTARIOS !!! Día 18 DICIEMBRE 2025
  */
public class DiaSemana {

	public static void main(String[] args) {
		// ZONA DATOS: Declarar e inicializar
		Scanner sc = new Scanner(System.in);
		
		// Datos de entrada
		int dia = 0;
		// Datos de salida
		
		// ZONA DE INSTRUCCIONES
		// Leer el dia
		System.out.println("Por favor, introdude el día: ");
		dia = sc.nextInt();
		
		// Determinar en caso de distintos valores
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Día inválido!!!");
			
		}
		
		sc.close();
		System.out.println("Bye!!!!");
	}

}
