/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author mario.sanper.2
 */
public class Electronica extends Tienda implements Descuento {

    private String marca;
    private int añosGarantia;

    public Electronica(String nombre, double precioBase, String marca) {
        super(nombre, precioBase);
        this.marca = marca;
    }

    public Electronica(String nombre, int añosGarantia, double precioBase) {
        super(nombre, precioBase);
        this.añosGarantia = añosGarantia;
    }

    @Override
    public double calcularPrecioFinal(int descuento) {
        return getPrecioBase() * (descuento / 100);
    }

}
