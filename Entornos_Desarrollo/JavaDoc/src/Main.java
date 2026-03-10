import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		do {
			mostrarMenu();
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1 -> {
				pedirDatosEmpleado(sc);
			}
			}
		} while (true);
	}

	static void mostrarMenu() {
		System.out.println("\n--- SISTEMA DE GESTIÓN DE EMPLEADOS ---");
		System.out.println("1. Añadir empleado");
		System.out.println("2. Modificar empleado");
		System.out.println("3. Eliminar empleado");
		System.out.println("4. Listar empleados");
		System.out.println("5. Salir");
		System.out.print("Seleccione una opción: ");
	}

	static void pedirDatosEmpleado(Scanner sc) {
		Gestion gestion = new Gestion();
		System.out.print("ID: ");
		int id = sc.nextInt();
		sc.nextLine(); // Limpiar buffer
		System.out.print("Nombre: ");
		String nom = sc.nextLine();
		System.out.print("Apellidos: ");
		String ape = sc.nextLine();
		System.out.print("Edad: ");
		int edad = sc.nextInt();
		System.out.print("Salario: ");
		double sal = sc.nextDouble();
		gestion.añadirEmpleado(new Empleado(id, nom, ape, edad, sal));
	}
	static void modificarDatosEmpleado() {
		
	}
}
