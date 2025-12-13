package alumno;

import java.util.Scanner;

public class EsPar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numeroLeido;

		// Pedir cinco números enteros

		for (int i = 1; i <= 5; i++) {

			System.out.print("Introduce el número " + i + ": ");

			numeroLeido = scanner.nextInt();

			System.out.println("Número introducido: " + numeroLeido);

			// Llamada a la función para verificar si es par o no

			if (esPar(numeroLeido)) {

				System.out.println("El número es par.");

			} else {

				System.out.println("El número es impar.");

			}

		}

		scanner.close(); // Cerramos el scanner

		System.out.println("El programa ha terminado");

	}

	// Función para verificar si un número es par

	public static boolean esPar(int numero) {

		return numero % 2 == 0;

	}

}
