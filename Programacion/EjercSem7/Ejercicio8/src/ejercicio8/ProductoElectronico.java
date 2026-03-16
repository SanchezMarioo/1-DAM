/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Mario
 */
public class ProductoElectronico {
    private int id;
    private String nombre;
    private double peso;
    private boolean fragil;

    public ProductoElectronico(int id, String nombre, double peso, boolean fragil) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.fragil = fragil;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", fragil=" + fragil;
    }
    
}
