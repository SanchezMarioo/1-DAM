/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author mario.sanper.2
 */
public class Ropa extends Tienda implements Descuento {

    private String talla;
    private String tipoPrenda;
    private String color;

    public Ropa(String nombre, String talla, String tipoPrenda, double precioBase) {
        super(nombre, precioBase);
        this.talla = talla;
        this.tipoPrenda = tipoPrenda;
    }

    public Ropa(String nombre, String talla, double precioBase, String color) {
        super(nombre, precioBase);
        this.talla = talla;
        this.tipoPrenda = tipoPrenda;
    }

    @Override
    public double calcularPrecioFinal(int descuento) {
        return getPrecioBase() * (descuento / 100);
    }

}
