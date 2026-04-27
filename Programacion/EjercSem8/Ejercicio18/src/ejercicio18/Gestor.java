/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Gestor {

    private Scanner sc;
    private final int MAX_PRODUCTOS = 5;
    private Producto productos[] = new Producto[MAX_PRODUCTOS];

    public Gestor() {
        sc = new Scanner(System.in);
    }

    private void añadirProducto(Producto producto) {
        int contador = 0;
        productos[contador] = producto;
        contador++;
    }

    private void cargarDatos() {
        añadirProducto(new Producto("Camiseta"));
        añadirProducto(new Producto("Pantalon"));
        añadirProducto(new Producto("Zapatillas"));
        añadirProducto(new Producto("Chaqueta"));
    }

    public void init() {
        try {
            System.out.println("Dime la posicion del array: ");
            int posicion = sc.nextInt(); // La excepción de tipo salta aquí

            Producto p = consultarProducto(posicion);

            if (p != null) {
                System.out.println("Producto encontrado: " + p);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: La entrada debe ser un número entero.");
        }
    }

    private Producto consultarProducto(int posicion) {
        try {
            Producto productoPosicion = productos[posicion];
            return productoPosicion;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
