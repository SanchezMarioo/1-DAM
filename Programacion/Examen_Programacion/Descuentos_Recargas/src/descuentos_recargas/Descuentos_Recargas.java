/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentos_recargas;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Descuentos_Recargas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int eleccion;
        float precio, precioFinal = 0;
        boolean boolcien = false, boolcuatro = false, boolmil = false, boolmiluno = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio con Descuentos y Recargos");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.println("3. Transferencia");
        System.out.println("Dime que numero eliges: ");
        eleccion = sc.nextInt();
        System.out.println("Dime el precio: ");
        precio = sc.nextInt();
        if (precio >= 0) {
            if (precio < 100) {
                boolcien = true;
            } else if (precio < 499.99) {
                boolcuatro = true;
            } else if (precio < 999.99) {
                boolmil = true;
            } else if (precio >= 1000) {
                boolmiluno = true;
            }
            System.out.println(boolcien + "" + boolcuatro + "" + boolmil + "" + boolmiluno);
            switch (eleccion) {
                case 1:
                    precioFinal = (float) (boolcuatro ? precio * 0.95 : precio);
                    precioFinal = (float) (boolmil ? precio * 0.90 : precio);
                    precioFinal = (float) (boolmiluno ? precio * 0.85 : precio);
                    break;
                case 2:
                    precioFinal = (float) (boolmil ? precio * 0.95 : precio);
                    precioFinal = (float) (boolmiluno ? precio * 0.90 : precio);
                    break;
                case 3:
                    precioFinal = (float) (boolcuatro ? precio * 0.98 : precio);
                    precioFinal = (float) (boolmiluno ? precio * 0.95 : precio);
                    break;
                default:
                    System.out.println("No has elegido una opcion correcto");
                    break;
            }
            System.out.printf("El precio final %2f%n", precioFinal);
        } else{
            System.out.println("Precio invalido ");
        }
    }

}
