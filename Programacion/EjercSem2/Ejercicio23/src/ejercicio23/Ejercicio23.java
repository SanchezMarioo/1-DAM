/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int aforoMaximo, precioEntrada, numVendidasEntradas,porcentajeAforo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el aforo maximo: ");
        aforoMaximo = sc.nextInt();
        System.out.print("Dime el precio entrada: ");
        precioEntrada = sc.nextInt();
        System.out.print("Dime el numero de entradas vendidas: ");
        numVendidasEntradas = sc.nextInt();
        
        porcentajeAforo = (numVendidasEntradas * aforoMaximo) / 100;
        
        System.out.println(porcentajeAforo);

    }

}
