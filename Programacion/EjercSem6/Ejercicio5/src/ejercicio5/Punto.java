/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author mario.sanper.2
 */
public class Punto {

    public Punto(int par, int par1) {
        x = par;
        y = par1;
    }
    int x;
    int y;

    void imprimirCoordenadas() {
        System.out.println(x + " " + y);
    }
}
