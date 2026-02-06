/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author mario.sanper.2
 */
public class Rectangulo {

    int x1;
    int x2;
    int y1;
    int y2;

    Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        } else {
            System.err.println("Coordenadas invalidas");
        }
    }

    void mostrarCoordenadas() {
        System.out.println("(" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
    }

    void getPerimetro() {
        System.out.println("El perimetro es " + (x1 + x2 + y1 + y2));
    }

    void getArea() {
        int base = x2 - x1;
        int altura = y2 - y1;
        System.out.println("El área es " + (base * altura));
    }
}
