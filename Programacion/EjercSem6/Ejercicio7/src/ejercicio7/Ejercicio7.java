/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Articulo articulo1 = new Articulo("Pijama", 12, 5);
        articulo1.mostrarArticuloIVA();
        articulo1.precio *= 2;
        Articulo articulo2 = new Articulo("Camiseta", 30, 20);
        articulo1.mostrarArticuloIVA();
        articulo1.precio /= 2;
        System.out.println("===============");
        articulo2.mostrarArticuloIVA();

    }

}
