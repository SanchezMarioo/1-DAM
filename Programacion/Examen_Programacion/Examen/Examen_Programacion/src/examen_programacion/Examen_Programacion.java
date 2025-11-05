/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_programacion;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Examen_Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int distancia, autonomia = 0, porcentajeTotal = 0;
        double porcentaje = 0;
        char modoConduccion;
        final double economico = 0.15;
        final double normal = 0.20;
        final double sport = 0.30;
        boolean cargaRapida = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el porcentaje de la bateria?: ");
        porcentaje = sc.nextInt();
        System.out.println("¿Cual es la distancia a recorrer en km?: ");
        distancia = sc.nextInt();
        System.out.println("\n ===== MODO CONDUCCION =====");
        System.out.println("Economico: E");
        System.out.println("Normal: N");
        System.out.println("Sport: S");
        System.out.println("¿En que modo conduccion conduces (E,N,S): ");
        modoConduccion = sc.next().charAt(0);
        System.out.println("¿Hay puntos de carga rapida en el camino (true/false): ");
        cargaRapida = sc.nextBoolean();
        if (porcentaje >= 0 && porcentaje <= 100) {
            if (distancia > 0) {
                switch (modoConduccion) {
                    case 'E', 'e':
                        autonomia = (int) (distancia * economico);
                        System.out.println(porcentajeTotal);
                        break;
                    case 'N', 'n':
                        autonomia = (int) (distancia * normal);
                        break;
                    case 'S', 's':
                        autonomia = (int) (distancia * sport);
                        break;
                    default:
                        System.out.println("Letra incorrecta (E/N/S)");
                }
                porcentajeTotal = (int) (porcentaje - autonomia);
                if (porcentajeTotal > porcentaje) {
                    System.out.println("Viaje posible, sin recarga " + porcentajeTotal);
                } else if (cargaRapida && porcentaje > porcentajeTotal) {
                    System.out.println("Llegas justo pero tienes que recarga por el camino ");
                } else if (!cargaRapida && porcentaje > porcentajeTotal) {
                    System.out.println("No puedes completar el viaje");
                } else{
                    System.out.println("Datos invalidos");
                }
            } else {
                System.out.println("Datos invalidos");
            }
        } else {
            System.out.println("Datos invalidos");
        }
    }

}
