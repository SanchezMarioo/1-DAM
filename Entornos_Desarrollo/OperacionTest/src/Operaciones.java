
public class Operaciones {
	// Creacion de atributos SIEMPRE privados
	private int num1;
	private int num2;

	// Creacion de construccion
	public Operaciones(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}

	public int suma(int a, int b) {
		return a + b;
	}

	public int resta(int a, int b) {
		return a - b;
	}

	public int multi(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		return a / b;
	}
}
