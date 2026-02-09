 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(7, 9, 2, 3);

        // Mostrar datos iniciales
        System.out.println("Rectángulo 1:");
        r1.mostrarCoordenadas();
        r1.getPerimetro();
        r1.getArea();

        System.out.println("\nRectángulo 2:");
        r2.mostrarCoordenadas();
        r2.getPerimetro();
        r2.getArea();

        // Modificar coordenadas
        r1.x1 = 4;
        r1.y1 = 1;
        r1.x2 = 6;
        r1.y2 = 4;

        r2.x1 = 0;
        r2.y1 = 0;
        r2.x2 = 1;
        r2.y2 = 6;

        // Mostrar datos modificados
        System.out.println("\nDespués de modificar coordenadas:");

        System.out.println("Rectángulo 1:");
        r1.mostrarCoordenadas();
        r1.getPerimetro();
        r1.getArea();

        System.out.println("\nRectángulo 2:");
        r2.mostrarCoordenadas();
        r2.getPerimetro();
        r2.getArea();
    }

}
