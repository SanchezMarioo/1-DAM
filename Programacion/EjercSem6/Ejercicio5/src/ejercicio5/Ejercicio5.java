/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1 = new Punto(22 * 2, 4);
        punto1.x += 4;
        punto1.y /= 2;
        punto1.imprimirCoordenadas();
        Punto punto2 = new Punto(25 * 2, 4);
        punto1.x *= 4;
        punto1.y /= 2;
        punto2.imprimirCoordenadas();

    }

}
