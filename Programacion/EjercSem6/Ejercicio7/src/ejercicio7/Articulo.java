/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mario.sanper.2
 */
public class Articulo {

    String nombre;
    double precio;
    final int IVA = 21;
    int cuantosQuedan;

    /**
     *
     * @param nombre
     * @param precio
     * @param cuantosQuedan
     */
    Articulo(String nombre, double precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }

    void mostrarArticuloIVA() {
        double pvp = precio + (precio * IVA / 100);
        System.out.println("nombre=" + nombre + ", precio=" + precio + ", IVA%= " + IVA + ", PVP final=" + pvp);
    }
}
