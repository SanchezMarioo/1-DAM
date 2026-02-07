/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author MARIO
 */
public class Videojuego {

    private String nombre;
    private String plataforma;
    private double precio;
    private static int contadorVideojuegos = 0;

    public Videojuego(String nombre, String plataforma, double precio) {
        setNombre(nombre);
        setPlataforma(plataforma);
        setPrecio(precio);
        contadorVideojuegos++;
    }

    public Videojuego(String nombre, String plataforma) {
        setNombre(nombre);
        setPlataforma(plataforma);
        setPrecio(59.99);
        contadorVideojuegos++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;

        } else {
            System.err.println("NO has introducido una cantidad mayor a 0 ");
        }
    }

    public void contadorVideojuegos(int contadorVideojuegos) {
        this.contadorVideojuegos = contadorVideojuegos;
    }

    public String getNombre(String nombre) {
        return nombre;
    }

    public String getPlataforma(String plataforma) {
        return plataforma;
    }

    public double getPrecio(double precio) {
        return precio;
    }

    public static void getContadorVidejuegos() {
        System.out.println("Numero de videojuegos: " + contadorVideojuegos);
    }

    public void aplicarDescuento(double porcentaje) {
        this.precio = precio - (precio * porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Videojuego{" + "nombre=" + nombre + ", plataforma=" + plataforma + ", precio=" + precio + '}';
    }

}
