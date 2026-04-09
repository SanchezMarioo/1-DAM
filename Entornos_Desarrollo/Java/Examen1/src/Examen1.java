public class Examen1 {

	public static long factorial(int n) {

		long fact = 1;

		for (int i = 1; i <= n; i++) {
			fact *= i;

		}

		return fact;
	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("El número de argumentos debe ser 1.");
			return;
		}

		int numero = Integer.parseInt(args[0]);

		long resultado = factorial(numero);

		System.out.println("El factorial de " + numero + " es: " + resultado);
	}

}
