/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author mario.sanper.2
 */
public class Rectangulo {

    int x1;
    int x2;
    int y1;
    int y2;

    Rectangulo(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    void mostrarCoordenadas() {
        System.out.println("(" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
    }

    void getPerimetro() {
        System.out.println("El perimetro es " + (x1 + x2 + y1 + y2));
    }

    void getArea() {
        System.out.println("El area 1 es: " + (x1 * y1));
        System.out.println("El area 2 es: " + (x2 * y2));
    }
}
