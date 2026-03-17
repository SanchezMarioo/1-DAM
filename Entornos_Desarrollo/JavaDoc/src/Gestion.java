/**
 * Clase encargada de administrar la colección de empleados.
 * 
 * @version 1.0
 * @author mario.sanper.2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
	private Scanner sc = new Scanner(System.in);
    private ArrayList<Empleado> listaEmpleados;

    public Gestion() {
        this.listaEmpleados = new ArrayList<>();
    }

    /**
     * Inicia la interfaz de usuario y el bucle del menú principal.
     */
    public void init() {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            logicaMenu(opcion);
        } while (opcion != 5);
    }

    /**
     * Muestra las opciones disponibles por consola.
     */
    private void mostrarMenu() {
        System.out.print("\n1.Añadir 2.Modificar 3.Eliminar 4.Listar 5.Salir\nSelección: ");
    }

    /**
     * Dirige el flujo del programa según la opción del menú.
     * @param opcion Código de la opción elegida.
     */
    private void logicaMenu(int opcion) {
        switch (opcion) {
            case 1 -> getDatosEmpleado();
            case 2 -> getDatosModificacion();
            case 3 -> getIdEliminar();
            case 4 -> mostrarListaEmpleados();
            case 5 -> System.out.println("Cerrando el sistema de gestión...");
            default -> System.out.println("Opción no válida.");
        }
    }

    /**
     * Pide los datos por consola para registrar un nuevo empleado.
     */
    private void getDatosEmpleado() {
        System.out.print("Introduzca ID: ");
        int id = sc.nextInt();
        System.out.print("Introduzca Nombre: ");
        String nombre = sc.next();
        System.out.print("Introduzca Apellido: ");
        String apellido = sc.next();
        System.out.print("Introduzca Edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduzca salario: ");
        double salario = sc.nextDouble();
        
        registrarEmpleado(new Empleado(id, nombre, apellido, edad, salario));
    }

    /**
     * Pide el ID y los nuevos valores para actualizar a un empleado.
     */
    private void getDatosModificacion() {
        System.out.print("ID del empleado a modificar: ");
        int id = sc.nextInt();
        System.out.print("Introduzca el nuevo Nombre y Salario: ");
        String nuevoNombre = sc.next();
        double nuevoSalario = sc.nextDouble();
        
        actualizarDatosEmpleado(id, nuevoNombre, nuevoSalario);
    }

    /**
     * Pide el ID del empleado que se desea borrar.
     */
    private void getIdEliminar() {
        System.out.print("ID del empleado a eliminar: ");
        int id = sc.nextInt();
        eliminarEmpleado(id);
    }

    /**
     * Agrega un objeto Empleado a la colección interna.
     * @param empleado El objeto empleado ya creado.
     */
    public void registrarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println("Registro realizado con éxito.");
    }

    /**
     * Busca un empleado por su id y actualiza sus campos.
     * @param id Identificador único.
     * @param nuevoNombre Nuevo nombre asignado.
     * @param nuevoSalario Nuevo salario asignado.
     */
    public void actualizarDatosEmpleado(int id, String nuevoNombre, double nuevoSalario) {
        for (Empleado emp : listaEmpleados) {
            if (emp.getId() == id) {
                emp.setNombre(nuevoNombre);
                emp.setSalario(nuevoSalario);
                System.out.println("Datos actualizados correctamente.");
                return;
            }
        }
        System.out.println("Error: No se encontró el ID " + id);
    }

    /**
     * Evlimina a un empleado de la lista por su ID.
     * @param id Identificador del empleado a borrar.
     */
    public void eliminarEmpleado(int id) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getId() == id) {
                String nombre = listaEmpleados.get(i).getNombre();
                listaEmpleados.remove(i);
                System.out.println("El empleado " + nombre + " ha sido eliminado del sistema.");
                return;
            }
        }
        System.out.println("Ese ID no existe.");
    }

    /**
     * Muestra la lista completa de empleados.
     */
    public void mostrarListaEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("La lista está actualmente vacía.");
        } else {
            System.out.println("\n--- LISTA DE EMPLEADOS ---");
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado);
            }
        }
    }
}