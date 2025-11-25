/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] valores = {10, 20, 30, 40, 50};
        int[] nuevo = new int[valores.length + 1];
        int posicionInsertar = 0;
        int numeros = 0;
        boolean entraDeNuevo = false;
        boolean esIgual = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Añade un numero: ");
        int numeroAñadir = sc.nextInt();
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] >= numeroAñadir && !entraDeNuevo) {
                posicionInsertar = i;
                entraDeNuevo = true;
                System.out.println("El numero " + i + " es mayor que " + numeroAñadir);
            } else if(!entraDeNuevo){
                posicionInsertar = valores.length;
            }
        }
        for (int i = 0; i < nuevo.length; i++) {
            if (numeros < posicionInsertar) {
                nuevo[numeros] = valores[i];
            } else if (numeros == posicionInsertar && !esIgual) {
                nuevo[posicionInsertar] = numeroAñadir;
                esIgual = true;
                continue;
            } else {
                nuevo[numeros + 1] = valores[numeros];
            }
            numeros++;
        }
        for (int i = 0; i < nuevo.length; i++) {
            System.out.print(nuevo[i] + " ");
        }
    }

}
